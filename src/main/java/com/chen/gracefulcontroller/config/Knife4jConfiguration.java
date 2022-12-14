package com.chen.gracefulcontroller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 *
 * @author：MaybeBin
 * @date: 2022-01-25 09:25
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("APIs")
                        .description("APIs")
                        .version("1.0")
                        .build())
                .select()
                //controller
                .apis(RequestHandlerSelectors.basePackage("com.chen.gracefulcontroller.grace"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
