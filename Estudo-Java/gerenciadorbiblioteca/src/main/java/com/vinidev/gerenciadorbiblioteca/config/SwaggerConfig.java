package com.vinidev.gerenciadorbiblioteca.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    
    private static final String API_EMAIL_AUTOR = "viniciusberaldo.eng@gmail.com";
    private static final String API_URL_AUTOR = "https://github.com/viniberaldo";
    private static final String API_AUTOR = "Vinicius Beraldo";
    private static final String API_VERSAO = "1.0.0";
    private static final String API_DESCRICAO = "API de gerenciamento de biblioteca";
    private static final String API_TITULO = "Projeto Gerenciador de Biblioteca";
    private static final String PACOTE_BASE = "com/vinidev/gerenciadorbiblioteca";
    
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(PACOTE_BASE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITULO)
                .description(API_DESCRICAO)
                .version(API_VERSAO)
                .contact(new Contact(API_AUTOR, API_URL_AUTOR, API_EMAIL_AUTOR))
                .build();
    }
}
