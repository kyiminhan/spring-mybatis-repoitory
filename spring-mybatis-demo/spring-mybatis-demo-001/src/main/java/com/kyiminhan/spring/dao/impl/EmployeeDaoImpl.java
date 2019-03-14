package com.kyiminhan.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.dao.EmployeeDao;
import com.kyiminhan.spring.dao.mapper.BaseMapper;
import com.kyiminhan.spring.dao.mapper.EmployeeMapper;
import com.kyiminhan.spring.entity.Employee;

/**
 * The Class EmployeeDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.dao.impl </BR>
 *        EmployeeDaoImpl.java </BR>
 */
@Repository

/**
 * Sets the employee mapper.
 *
 * @param employeeMapper the new employee mapper
 */
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private final EmployeeMapper employeeMapper;

	public EmployeeDaoImpl(BaseMapper<Employee> baseMapper) {
		super(baseMapper);
		this.employeeMapper = (EmployeeMapper) baseMapper;
	}
}