package com.kyiminhan.spring.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.dao.EmployeeDao;
import com.kyiminhan.spring.dao.mapper.EmployeeMapper;
import com.kyiminhan.spring.entity.Employee;

import lombok.Setter;

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
@Setter(onMethod = @__(@Autowired))
public class EmployeeDaoImpl implements EmployeeDao {

	/** The employee mapper. */
	private EmployeeMapper employeeMapper;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.EmployeeDao#save(com.kyiminhan.spring.entity.
	 * Employee)
	 */
	@Override
	public int save(Employee employee) {
		return this.employeeMapper.save(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.EmployeeDao#update(com.kyiminhan.spring.entity.
	 * Employee)
	 */
	@Override
	public int update(Employee employee) {
		return this.employeeMapper.update(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.EmployeeDao#delete(com.kyiminhan.spring.entity.
	 * Employee)
	 */
	@Override
	public void delete(Employee employee) {
		this.employeeMapper.delete(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.EmployeeDao#getAll()
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.employeeMapper.getAll();
	}
}