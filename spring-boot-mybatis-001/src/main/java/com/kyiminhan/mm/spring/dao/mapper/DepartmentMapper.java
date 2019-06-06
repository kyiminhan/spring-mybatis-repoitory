package com.kyiminhan.mm.spring.dao.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.entity.Department;

/**
 * The Interface DepartmentMapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/06 </BR>
 * spring-boot-mybatis-001 system </BR>
 * com.kyiminhan.mm.spring.dao.mapper </BR>
 * DepartmentMapper.java </BR>
 */
@Mapper
public interface DepartmentMapper {

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
	 * @return int
	 */
	int delete(Department department);

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