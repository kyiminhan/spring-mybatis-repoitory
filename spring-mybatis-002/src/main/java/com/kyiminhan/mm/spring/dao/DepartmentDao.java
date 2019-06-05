package com.kyiminhan.mm.spring.dao;

import java.util.Collection;

import com.kyiminhan.mm.spring.entity.Department;

/**
 * The Interface DepartmentDao.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.dao </BR>
 * DepartmentDao.java </BR>
 */
public interface DepartmentDao {

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
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Department> getAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	Department findById(Integer id);
}