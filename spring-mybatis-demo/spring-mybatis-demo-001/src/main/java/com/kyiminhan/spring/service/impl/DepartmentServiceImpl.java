package com.kyiminhan.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyiminhan.spring.dao.DepartmentDao;
import com.kyiminhan.spring.entity.Department;
import com.kyiminhan.spring.service.DepartmentService;

import lombok.Setter;

/**
 * The Class DepartmentServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.service.impl </BR>
 *        DepartmentServiceImpl.java </BR>
 */
@Service

/**
 * Sets the department dao.
 *
 * @param departmentDao the new department dao
 */
@Setter(onMethod = @__(@Autowired))
public class DepartmentServiceImpl implements DepartmentService {

	/** The department dao. */
	private DepartmentDao departmentDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.DepartmentService#save(com.kyiminhan.spring.
	 * entity .Department)
	 */
	@Override
	public int save(Department employee) {
		return this.departmentDao.save(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.DepartmentService#update(com.kyiminhan.spring.
	 * entity.Department)
	 */
	@Override
	public int update(Department employee) {
		return this.departmentDao.update(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.service.DepartmentService#delete(com.kyiminhan.spring.
	 * entity.Department)
	 */
	@Override
	public void delete(Department employee) {
		this.departmentDao.delete(employee);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.service.DepartmentService#getAll()
	 */
	@Override
	public Collection<Department> getAll() {
		return this.departmentDao.getAll();
	}
}