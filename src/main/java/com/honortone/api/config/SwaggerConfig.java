package com.honortone.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置
 *
 * @author 丁国钊
 * @date 2023-2-7
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /****
     * 接口配置
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 分组名称
                .groupName("KanBan-Api")
                .select()
                // 扫描的包名称
                .apis(RequestHandlerSelectors.basePackage("com.honortone.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /***
     * 构建 api文档的详细信息函数
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2 API接口文档")
                .description("鸿通看板接口文档")
                .contact(new Contact("丁国钊", null, null))
                .version("1.0")
                .build();
    }

}