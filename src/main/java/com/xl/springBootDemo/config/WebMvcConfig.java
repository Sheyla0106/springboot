package com.xl.springBootDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置Swagger的资源映射路径
 *原有WebMvcConfigurerAdapter已经过时 使用WebMvcConfigurer取代
 * @author MR.ZHANG
 * @create 2018-09-18 10:41
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${swagger.enable}")
    private boolean enableSwagger;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (enableSwagger) {
            registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }

}
