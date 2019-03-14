package com.kyiminhan.spring.dao.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.spring.entity.Employee;

@Mapper
public interface EmployeeMapper {

	int save(Employee employee);

	int update(Employee employee);

	int delete(Employee employee);

	Collection<Employee> getAll();

}