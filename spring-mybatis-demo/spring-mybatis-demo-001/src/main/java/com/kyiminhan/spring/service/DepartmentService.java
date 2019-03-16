package com.kyiminhan.spring.service;

import java.util.Collection;

import com.kyiminhan.spring.entity.Department;

/**
 * The Interface DepartmentService.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.service </BR>
 *        DepartmentService.java </BR>
 */
public interface DepartmentService {

	/**
	 * Save.
	 *
	 * @param Department the department
	 * @return int
	 */
	int save(Department department);

	/**
	 * Update.
	 *
	 * @param Department the department
	 * @return int
	 */
	int update(Department department);

	/**
	 * Delete.
	 *
	 * @param Department the department
	 */
	void delete(Department department);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	Department findById(Integer id);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Department> getAll();
}