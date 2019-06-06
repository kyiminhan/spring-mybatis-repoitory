package com.kyiminhan.mm.spring.configuration;

import java.nio.charset.StandardCharsets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * The Class AppConfig.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/06 </BR>
 * spring-boot-mybatis-001 system </BR>
 * com.kyiminhan.mm.spring.configuration </BR>
 * AppConfig.java </BR>
 */
@Configuration
public class AppConfig implements WebMvcConfigurer {

	/**
	 * Template resolver.
	 *
	 * @return ClassLoaderTemplateResolver
	 */
	@Bean
	@Description("Thymeleaf template resolver serving HTML 5")
	public ClassLoaderTemplateResolver templateResolver() {
		final ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix("templates/views/");
		templateResolver.setCacheable(false);
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setCharacterEncoding(StandardCharsets.UTF_8.toString());
		return templateResolver;
	}

	/**
	 * Template engine.
	 *
	 * @return SpringTemplateEngine
	 */
	@Bean
	@Description("Thymeleaf template engine with Spring integration")
	public SpringTemplateEngine templateEngine() {
		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(this.templateResolver());
		return templateEngine;
	}

	/**
	 * View resolver.
	 *
	 * @return ViewResolver
	 */
	@Bean
	@Description("Thymeleaf view resolver")
	public ViewResolver viewResolver() {
		final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(this.templateEngine());
		viewResolver.setCharacterEncoding(StandardCharsets.UTF_8.toString());
		return viewResolver;
	}

}