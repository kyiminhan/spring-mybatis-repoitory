package com.kyiminhan.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.dao.DepartmentDao;
import com.kyiminhan.spring.dao.mapper.BaseMapper;
import com.kyiminhan.spring.dao.mapper.DepartmentMapper;
import com.kyiminhan.spring.entity.Department;

/**
 * The Class DepartmentDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.dao.impl </BR>
 *        DepartmentDaoImpl.java </BR>
 */
@Repository
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Department mapper. */
	@SuppressWarnings("unused")
	private final DepartmentMapper DepartmentMapper;

	/**
	 * Instantiates a new department dao impl.
	 *
	 * @param baseMapper the base mapper
	 */
	public DepartmentDaoImpl(BaseMapper<Department> baseMapper) {
		super(baseMapper);
		this.DepartmentMapper = (DepartmentMapper) baseMapper;
	}
}