package com.honortone.commons.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * Mybatis Plus 逆向生成
 *
 * @author 丁国钊
 * @date 2023-2-4
 */
public class MybatisPlusGenerate {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                "jdbc:sqlserver://172.31.2.131;DatabaseName=HTMES_FGManagement_DB",
                "sa",
                "dyb8110!")
                .globalConfig(builder -> {
                    builder.author("丁国钊")
                            // 开启 swagger
                            .enableSwagger()
                            // 文件覆盖
                            .fileOverride()
                            // 禁止打开输出目录
                            .disableOpenDir()
                            // 输出目录
                            .outputDir("D:/GitCode/product-kanban-api/kanban-api-commons/src/main/java/");
                })
                .packageConfig(builder -> {
                    builder
                            // 包名
                            .parent("com.honortone.commons")
                            // mapper.xml 输出路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    "D:/GitCode/product-kanban-api/kanban-api-commons/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder
                            // 需要生成的表名
                            .addInclude("FG_Inventory")
                            // 过滤表前缀
                            .addTablePrefix("FG")
                            .mapperBuilder()
                            // 开启 @Mapper 注解
                            .enableMapperAnnotation()
                            // 启用 BaseResultMap 生成
                            .enableBaseResultMap()
                            // 启用 BaseColumnList
                            .enableBaseColumnList();
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                // 禁止生成 controller
                .templateConfig(builder -> builder.controller(""))
                .execute();
    }
}
