package com.kyiminhan.mm.spring.department.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.mm.spring.department.mapper.DeptSQL01Mapper;
import com.kyiminhan.mm.spring.department.mapper.DeptSQL02Mapper;
import com.kyiminhan.mm.spring.department.mapper.DeptSQL03Mapper;
import com.kyiminhan.mm.spring.department.mapper.DeptSQL04Mapper;
import com.kyiminhan.mm.spring.department.mapper.DeptSQL05Mapper;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DepartmentDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.department.dao </BR>
 * DepartmentDaoImpl.java </BR>
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	/** The dept SQL 01 mapper. */
	@Autowired
	private DeptSQL01Mapper deptSQL01Mapper;
	
	/** The dept SQL 02 mapper. */
	@Autowired
	private DeptSQL02Mapper deptSQL02Mapper;
	
	/** The dept SQL 03 mapper. */
	@Autowired
	private DeptSQL03Mapper deptSQL03Mapper;
	
	/** The dept SQL 04 mapper. */
	@Autowired
	private DeptSQL04Mapper deptSQL04Mapper;
	
	/** The dept SQL 05 mapper. */
	@Autowired
	private DeptSQL05Mapper deptSQL05Mapper;

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int save(final Department department) {
		return this.deptSQL01Mapper.execute(department);
	}

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int update(final Department department) {
		return this.deptSQL02Mapper.execute(department);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	@Override
	public Department findById(final Integer id) {
		return this.deptSQL03Mapper.execute(id);
	}

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	@Override
	public void delete(final Department department) {
		this.deptSQL04Mapper.execute(department);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Department> getAll() {
		return this.deptSQL05Mapper.execute();
	}
}