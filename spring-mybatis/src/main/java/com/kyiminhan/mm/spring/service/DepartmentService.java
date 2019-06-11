package com.kyiminhan.mm.spring.service;

import java.util.Collection;

import com.kyiminhan.mm.spring.entity.Department;

/**
 * The Interface DepartmentService.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/11 </BR>
 * spring-mybatis system </BR>
 * com.kyiminhan.mm.spring.service </BR>
 * DepartmentService.java </BR>
 */
public interface DepartmentService {

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	int save(Department department);

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	int update(Department department);

	/**
	 * Delete.
	 *
	 * @param department the department
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