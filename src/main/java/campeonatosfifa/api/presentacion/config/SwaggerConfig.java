package campeonatosfifa.api.presentacion.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI configurarOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Campeonatos FIFA")
                        .description("API para gestionar información de los Campeonatos Mundiales de la FIFA")
                        .version("1.0.0"));
    }
}