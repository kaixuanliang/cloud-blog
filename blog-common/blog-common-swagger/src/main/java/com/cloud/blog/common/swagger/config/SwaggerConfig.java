package com.cloud.blog.common.swagger.config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lkx
 * @since: 2023/2/5 20:28
 * @description:
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket manageDocket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("系统监控")
                .apiInfo(manageApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cloud.blog.manage.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo manageApiInfo() {
        return new ApiInfoBuilder()
                .title("華小灼管理系统swagger文档")
                .description("華小灼管理系统swagger文档")
                .version("1.0.0")
                .contact(new Contact("華小灼GITEE", "https://gitee.com/peachtec", "18482133793@163.com"))
                .termsOfServiceUrl("https://blog.csdn.net/weixin_45481406")
                .build();
    }
}