package com.devisis.apibandas.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * *
 * @author isis_cunha
 *
 */

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
            AppContext.class
        };
        //return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
            BandasConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }
}


