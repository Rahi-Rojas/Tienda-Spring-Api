package com.rojas.spring.app.tiendaspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") //1- aplica a todas las rutas
                        .allowedOrigins("http://localhost:5173") //2- Permite solo este origen (Tu app react)
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") //3- Metodos permitidos
                        .allowedHeaders("*") //4- Permite todos los headers (como authorization, context type)
                        .allowCredentials(true); //5- Permite enviar cookies o tokens (opcional)
            }
        };
    }
}
