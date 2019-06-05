package com.kyiminhan.mm.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The Class AppInitializer.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.config </BR>
 * AppInitializer.java </BR>
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * Gets the root config classes.
	 *
	 * @return the root config classes
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MyBatisConfig.class };
	}

	/**
	 * Gets the servlet config classes.
	 *
	 * @return the servlet config classes
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	/**
	 * Gets the servlet mappings.
	 *
	 * @return the servlet mappings
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}