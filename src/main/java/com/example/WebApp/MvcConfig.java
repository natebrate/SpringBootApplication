package com.example.WebApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
/*
Help direct user to the 403.html page once error has occured
 */
    //@Override
    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/403").setViewName("403");
    }

}
