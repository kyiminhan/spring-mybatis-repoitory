package com.kyiminhan.mm.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyiminhan.mm.spring.dao.DepartmentDao;
import com.kyiminhan.mm.spring.entity.Department;
import com.kyiminhan.mm.spring.service.DepartmentService;

/**
 * The Class DepartmentServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.service.impl </BR>
 * DepartmentServiceImpl.java </BR>
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	/** The department dao. */
	private DepartmentDao departmentDao;

	/**
	 * Sets the department dao.
	 *
	 * @param departmentDao the new department dao
	 */
	@Autowired
	public void setDepartmentDao(final DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int save(final Department department) {
		return this.departmentDao.save(department);
	}

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int update(final Department department) {
		return this.departmentDao.update(department);
	}

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	@Override
	public void delete(final Department department) {
		this.departmentDao.delete(department);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	@Override
	public Department findById(final Integer id) {
		return this.departmentDao.findById(id);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Department> getAll() {
		return this.departmentDao.getAll();
	}
}