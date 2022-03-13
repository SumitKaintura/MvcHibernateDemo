package com.ecomm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("-----------Get Root Config Classes-------------");
        return new Class[] {WebResolver.class,DBConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("---------Get Configuration Based Classes----------");
        return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("-----------Get Servlet Mappings------------");
        return new String[] {"/"};
	}

}
