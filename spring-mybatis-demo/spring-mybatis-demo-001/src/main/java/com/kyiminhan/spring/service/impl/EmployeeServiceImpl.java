package com.kyiminhan.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyiminhan.spring.dao.EmployeeDao;
import com.kyiminhan.spring.entity.Employee;
import com.kyiminhan.spring.service.EmployeeService;

import lombok.Setter;

/**
 * The Class EmployeeServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.service.impl </BR>
 *        EmployeeServiceImpl.java </BR>
 */
@Service

/**
 * Sets the employee dao.
 *
 * @param employeeDao the new employee dao
 */
@Setter(onMethod = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	private EmployeeDao employeeDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.EmployeeService#save(com.kyiminhan.spring.entity
	 * .Employee)
	 */
	@Override
	public int save(Employee employee) {
		return this.employeeDao.save(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.EmployeeService#update(com.kyiminhan.spring.
	 * entity.Employee)
	 */
	@Override
	public int update(Employee employee) {
		return this.employeeDao.update(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.EmployeeService#delete(com.kyiminhan.spring.
	 * entity.Employee)
	 */
	@Override
	public void delete(Employee employee) {
		this.employeeDao.delete(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.service.EmployeeService#getAll()
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.employeeDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.service.EmployeeService#findById(java.lang.Integer)
	 */
	@Override
	public Employee findById(Integer id) {
		return this.employeeDao.findById(id);
	}
}