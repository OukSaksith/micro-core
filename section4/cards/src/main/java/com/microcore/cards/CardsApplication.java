package com.microcore.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.microcore.cards.controller") })
@EnableJpaRepositories("com.microcore.cards.repository")
@EntityScan("com.microcore.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "MicroCore Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "OUK Saksith",
                        email = "ouksaksith11@gmail.com",
                        url = "https://github.com/OukSaksith"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "\"https://github.com/OukSaksith"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "MicroCore Cards microservice REST API Documentation",
                url = "http://localhost:9000/swagger-ui.html"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
