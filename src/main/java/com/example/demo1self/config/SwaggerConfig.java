package com.example.demo1self.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * FileName: SwaggerConfig
 * Author: yeyang
 * Date: 2018/3/28 13:57
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("非完全手打demoSelf")
                        .description("just test")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo1self"))
                .paths(PathSelectors.any())
                .build();
    }
}
