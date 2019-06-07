package com.kyiminhan.mm.spring.department.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Interface DeptSQL03Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.mapper </BR>
 * DeptSQL03Mapper.java </BR>
 */
@Mapper
public interface DeptSQL03Mapper {

	/**
	 * Execute.
	 *
	 * @param id the id
	 * @return Department
	 */
	Department execute(Integer id);
}