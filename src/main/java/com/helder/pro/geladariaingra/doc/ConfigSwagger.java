package com.helder.pro.geladariaingra.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfigSwagger {

	@Bean
	public Docket documentacao() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hcostaide.geladaria_ingra.endpoint.v1"))
				.build()
				.apiInfo(metaDados());
	}
	private ApiInfo metaDados() {
		return new ApiInfoBuilder()
				.title("Gerador de Exames por HCostaIDE")
				.description("IDE de Geração de Exames na base de perguntas.")
				.version("1.0")
				.contact(new Contact("Hélder Costa","helderdacsta@hotmail.com","www.hcostaide.com"))
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.build();
				
	}
}