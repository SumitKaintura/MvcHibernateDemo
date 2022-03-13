package com.ecomm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
	@EnableWebMvc
	@ComponentScan("com.ecomm.controller")
	public class WebResolver {

		
		@Bean
	    public InternalResourceViewResolver getViewResolver()
	    {
	        System.out.println("-----------I am in View Resolver---------------");
	        InternalResourceViewResolver iResolver=new InternalResourceViewResolver();
	        iResolver.setPrefix("/WEB-INF/views/");
	        iResolver.setSuffix(".jsp");
	        return iResolver;
	    }
	}

