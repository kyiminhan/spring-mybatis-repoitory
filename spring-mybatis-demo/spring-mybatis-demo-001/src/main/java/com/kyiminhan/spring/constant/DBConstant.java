package com.kyiminhan.spring.constant;

/**
 * The Interface DBConstant.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/03/13 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.constant </BR>
 *        DBConstant.java </BR>
 */
public interface DBConstant {

	/** The mysql driver. */
	String MYSQL_DRIVER = "mysql.driver";

	/** The mysql jdbcurl. */
	String MYSQL_JDBCURL = "mysql.jdbcUrl";

	/** The mysql username. */
	String MYSQL_USERNAME = "mysql.username";

	/** The mysql password. */
	String MYSQL_PASSWORD = "mysql.password";

	/** The component scan package. */
	String TYPE_ALIASES_PACKAGE = "mybatis.TypeAliasesPackage";
}