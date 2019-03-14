package com.kyiminhan.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The Class AppInitializer.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/03/13 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.config </BR>
 *        AppInitializer.java </BR>
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MyBatisConfig.class };
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses(
	 * )
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#
	 * getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}