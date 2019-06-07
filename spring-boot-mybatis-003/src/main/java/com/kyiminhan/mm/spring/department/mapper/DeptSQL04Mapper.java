package com.kyiminhan.mm.spring.department.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Interface DeptSQL04Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.department.mapper </BR>
 * DeptSQL04Mapper.java </BR>
 */
@Mapper
public interface DeptSQL04Mapper {

	/**
	 * Execute.
	 *
	 * @param department the department
	 * @return int
	 */
	int execute(Department department);
}