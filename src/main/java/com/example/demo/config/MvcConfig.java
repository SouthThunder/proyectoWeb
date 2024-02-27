package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
@EnableWebMvc

public class MvcConfig implements WebMvcConfigurer {
    public static final String INDEX_VIEW_NAME = "forward:index.html";



    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(INDEX_VIEW_NAME);
        registry.addViewController("/login").setViewName(INDEX_VIEW_NAME);
        registry.addViewController("/logout").setViewName(INDEX_VIEW_NAME);
    }
}