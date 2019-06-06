package com.kyiminhan.spring.config;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import lombok.Setter;

/**
 * The Class AppConfig.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.config </BR>
 *        AppConfig.java </BR>
 */
@EnableWebMvc
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.kyiminhan.spring" })
@PropertySource(value = "classpath:application.properties")

/**
 * Sets the application context.
 *
 * @param applicationContext the new application context
 */
@Setter(onMethod = @__(@Autowired))
public class AppConfig implements WebMvcConfigurer {

	/** The application context. */
	private ApplicationContext applicationContext;

	/**
	 * Template resolver.
	 *
	 * @return SpringResourceTemplateResolver
	 */
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		final SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext(this.applicationContext);
		templateResolver.setPrefix("/WEB-INF/views/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCharacterEncoding(StandardCharsets.UTF_8.name());
		templateResolver.setCacheable(false);
		return templateResolver;
	}

	/**
	 * Template engine.
	 *
	 * @return SpringTemplateEngine
	 */
	@Bean
	public SpringTemplateEngine templateEngine() {
		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(this.templateResolver());
		templateEngine.setEnableSpringELCompiler(true);
		templateEngine.addDialect(this.java8TimeDialect());
		return templateEngine;
	}

	/**
	 * View resolver.
	 *
	 * @return ThymeleafViewResolver
	 */
	@Bean
	public ThymeleafViewResolver viewResolver() {
		final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setContentType("text/html; charset=UTF-8");
		viewResolver.setTemplateEngine(this.templateEngine());
		return viewResolver;
	}

	/**
	 * Java 8 time dialect.
	 *
	 * @return Java8TimeDialect
	 */
	@Bean
	public Java8TimeDialect java8TimeDialect() {
		return new Java8TimeDialect();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
	 * addResourceHandlers(org.springframework.web.servlet.config.annotation.
	 * ResourceHandlerRegistry)
	 */
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/").setCachePeriod(31556926);
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}