package com.kyiminhan.mm.spring.dao.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.entity.Employee;

/**
 * The Interface EmployeeMapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/04 </BR>
 * spring-mybatis system </BR>
 * com.kyiminhan.mm.spring.dao.mapper </BR>
 * EmployeeMapper.java </BR>
 */
@Mapper
public interface EmployeeMapper {

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int save(Employee employee);

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int update(Employee employee);

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int delete(Employee employee);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Employee> getAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	Employee findById(Integer id);
}