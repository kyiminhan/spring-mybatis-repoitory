package com.kyiminhan.mm.spring.department.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Interface DeptSQL05Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.mapper </BR>
 * DeptSQL05Mapper.java </BR>
 */
@Mapper
public interface DeptSQL05Mapper {

	/**
	 * Execute.
	 *
	 * @return Collection
	 */
	Collection<Department> execute();
}