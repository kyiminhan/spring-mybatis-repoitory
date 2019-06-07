package com.kyiminhan.mm.spring.config;

import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class MyBatisConfig.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.config </BR>
 * MyBatisConfig.java </BR>
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfig {

	/**
	 * Gets the data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource getDataSource() {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kmh_test_db?serverTimezone=JST&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("rootR00T");
		return dataSource;
	}

	/**
	 * Gets the data source transaction manager.
	 *
	 * @return the data source transaction manager
	 */
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		return new DataSourceTransactionManager(this.getDataSource());
	}

	/**
	 * Gets the sql session factory bean.
	 *
	 * @return the sql session factory bean
	 * @throws Exception the exception
	 */
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactoryBean() throws Exception {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(this.getDataSource());
		sqlSessionFactoryBean.setTypeAliasesPackage("com.kyiminhan.mm.spring.domain");
		final Resource[] resources = new PathMatchingResourcePatternResolver()
				.getResources("classpath*:com/kyiminhan/mm/spring/**/*Mapper.xml");
		sqlSessionFactoryBean.setMapperLocations(resources);
		return sqlSessionFactoryBean.getObject();
	}

	/**
	 * Scan mybatis mapper.
	 *
	 * @return MapperScannerConfigurer
	 */
	@Bean
	public MapperScannerConfigurer scanMybatisMapper() {
		final MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		final String basePackage = this.getMapperScanBasePackages();
		configurer.setBasePackage(basePackage);
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return configurer;
	}

	/**
	 * Gets the mapper scan base packages.
	 *
	 * @return the mapper scan base packages
	 */
	private String getMapperScanBasePackages() {
		final Collection<String> collection = new ArrayList<>();
		collection.add("com.kyiminhan.mm.spring.department.mapper");
		collection.add("com.kyiminhan.mm.spring.employee.mapper");
		final String scanPackages = String.join(",", collection);
		return scanPackages;
	}
}