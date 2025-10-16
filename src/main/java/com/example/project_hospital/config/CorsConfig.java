package com.example.project_hospital.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // ✅ Cho phép tất cả domain gọi API
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
        
        // hoặc giới hạn domain cụ thể:
        // registry.addMapping("/**")
        //         .allowedOrigins("http://localhost:5174", "http://localhost:3000")
        //         .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
        //         .allowedHeaders("*")
        //         .allowCredentials(true);
    }
}