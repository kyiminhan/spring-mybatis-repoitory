package com.kyiminhan.mm.spring.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.mm.spring.dao.DepartmentDao;
import com.kyiminhan.mm.spring.dao.mapper.DepartmentMapper;
import com.kyiminhan.mm.spring.entity.Department;

/**
 * The Class DepartmentDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/04 </BR>
 *        spring-mybatis system </BR>
 *        com.kyiminhan.mm.spring.dao.impl </BR>
 *        DepartmentDaoImpl.java </BR>
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	/** The mapper. */
	private DepartmentMapper mapper;

	/**
	 * Sets the mapper.
	 *
	 * @param mapper the new mapper
	 */
	@Autowired
	public void setMapper(final DepartmentMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int update(final Department department) {
		return this.mapper.update(department);
	}

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	@Override
	public void delete(final Department department) {
		this.mapper.delete(department);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	@Override
	public Department findById(final Integer id) {
		return this.mapper.findById(id);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Department> getAll() {
		return this.mapper.getAll();
	}

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int save(final Department department) {
		return this.mapper.save(department);
	}
}