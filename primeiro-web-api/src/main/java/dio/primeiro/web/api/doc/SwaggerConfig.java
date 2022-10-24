package dio.primeiro.web.api.doc;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
                "Seu nome",
                "http://localhost:8080",
                "contato@contoto.com");


    }

    private ApiInfoBuilder informacoesApi() {
        ApiInfoBuilder info = new ApiInfoBuilder();
        info.title("Rest API");
        info.description("Rest API testes de como criar e configurar.");
        info.version("Rest API 1.0.1.0.9");
        info.termsOfServiceUrl("esse e o termo");
        info.license("licença - essa licença");
        info.licenseUrl("www.licenca.com.br");
        info.contact(this.contato());
        return info;
    }

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.primeiro.web.api.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;

    }
}


