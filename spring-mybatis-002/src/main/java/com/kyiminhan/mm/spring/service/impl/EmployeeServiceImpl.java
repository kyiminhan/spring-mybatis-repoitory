package com.kyiminhan.mm.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyiminhan.mm.spring.dao.EmployeeDao;
import com.kyiminhan.mm.spring.entity.Employee;
import com.kyiminhan.mm.spring.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.service.impl </BR>
 * EmployeeServiceImpl.java </BR>
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	private EmployeeDao employeeDao;

	/**
	 * Sets the employee dao.
	 *
	 * @param employeeDao the new employee dao
	 */
	@Autowired
	public void setEmployeeDao(final EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int save(final Employee employee) {
		return this.employeeDao.save(employee);
	}

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int update(final Employee employee) {
		return this.employeeDao.update(employee);
	}

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	@Override
	public void delete(final Employee employee) {
		this.employeeDao.delete(employee);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.employeeDao.getAll();
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	@Override
	public Employee findById(final Integer id) {
		return this.employeeDao.findById(id);
	}
}