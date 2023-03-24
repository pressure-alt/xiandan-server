package com.huang.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${xiandan.resources.picture.picUrl}")
    private String mapping;
    @Value("${xiandan.resources.picture.path}")
    private String path;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(mapping+"/**").addResourceLocations("file:"+path );
        WebMvcConfigurer.super.addResourceHandlers(registry);

    }
}
