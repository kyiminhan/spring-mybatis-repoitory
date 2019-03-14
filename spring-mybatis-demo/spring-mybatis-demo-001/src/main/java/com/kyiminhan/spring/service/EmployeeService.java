package com.kyiminhan.spring.service;

import java.util.Collection;

import com.kyiminhan.spring.entity.Employee;

/**
 * The Interface EmployeeService.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/03/13 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.service </BR>
 *        EmployeeService.java </BR>
 */
public interface EmployeeService {

	/**
	 * Save.
	 *
	 * @param employee the employee
	 */
	int save(Employee employee);

	/**
	 * Update.
	 *
	 * @param employee the employee
	 */
	int update(Employee employee);

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	void delete(Employee employee);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Employee> getAll();
}