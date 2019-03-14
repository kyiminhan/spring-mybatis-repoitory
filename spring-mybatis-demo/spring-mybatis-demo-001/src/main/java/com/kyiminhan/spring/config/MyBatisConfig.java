package com.kyiminhan.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.kyiminhan.spring.constant.DBConstant;

import lombok.Setter;

/**
 * The Class MyBatisConfig.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/03/13 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.config </BR>
 *        MyBatisConfig.java </BR>
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:db.properties" })
@MapperScan(basePackages = { "com.kyiminhan.spring.dao.mapper" })
@Setter(onMethod = @__(@Autowired))
public class MyBatisConfig {

	private Environment env;

	@Bean
	public DataSource getDataSource() {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(this.env.getProperty(DBConstant.MYSQL_DRIVER));
		dataSource.setUrl(this.env.getProperty(DBConstant.MYSQL_JDBCURL));
		dataSource.setUsername(this.env.getProperty(DBConstant.MYSQL_USERNAME));
		dataSource.setPassword(this.env.getProperty(DBConstant.MYSQL_PASSWORD));
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		return new DataSourceTransactionManager(this.getDataSource());
	}

	@Bean
	public SqlSessionFactory getSqlSessionFactoryBean() throws Exception {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(this.getDataSource());
		sqlSessionFactoryBean.setTypeAliasesPackage(this.env.getProperty(DBConstant.TYPE_ALIASES_PACKAGE));
		return sqlSessionFactoryBean.getObject();
	}
}