package com.kyiminhan.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyiminhan.spring.dao.EmployeeDao;
import com.kyiminhan.spring.entity.Employee;
import com.kyiminhan.spring.service.EmployeeService;

import lombok.Setter;

@Service
@Setter(onMethod = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Override
	public int save(Employee employee) {
		return this.employeeDao.save(employee);
	}

	@Override
	public int update(Employee employee) {
		return this.employeeDao.update(employee);
	}

	@Override
	public void delete(Employee employee) {
		this.employeeDao.delete(employee);
	}

	@Override
	public Collection<Employee> getAll() {
		return this.employeeDao.getAll();
	}
}