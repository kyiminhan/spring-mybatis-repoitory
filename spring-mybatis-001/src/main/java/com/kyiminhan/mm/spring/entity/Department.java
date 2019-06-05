package com.kyiminhan.mm.spring.entity;

import java.io.Serializable;

/**
 * The Class Department.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-001 system </BR>
 * com.kyiminhan.mm.spring.entity </BR>
 * Department.java </BR>
 */
public class Department implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private Integer id;
	
	/** The department name. */
	private String departmentName;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * Gets the department name.
	 *
	 * @return the department name
	 */
	public String getDepartmentName() {
		return this.departmentName;
	}

	/**
	 * Sets the department name.
	 *
	 * @param departmentName the new department name
	 */
	public void setDepartmentName(final String departmentName) {
		this.departmentName = departmentName;
	}
}