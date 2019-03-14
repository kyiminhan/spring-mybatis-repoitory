package com.kyiminhan.spring.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.dao.EmployeeDao;
import com.kyiminhan.spring.dao.mapper.EmployeeMapper;
import com.kyiminhan.spring.entity.Employee;

import lombok.Setter;

@Repository
@Setter(onMethod = @__(@Autowired))
public class EmployeeDaoImpl implements EmployeeDao {

	private EmployeeMapper employeeMapper;

	@Override
	public int save(Employee employee) {
		return this.employeeMapper.save(employee);
	}

	@Override
	public int update(Employee employee) {
		return this.employeeMapper.update(employee);
	}

	@Override
	public void delete(Employee employee) {
		this.employeeMapper.delete(employee);
	}

	@Override
	public Collection<Employee> getAll() {
		return this.employeeMapper.getAll();
	}
}