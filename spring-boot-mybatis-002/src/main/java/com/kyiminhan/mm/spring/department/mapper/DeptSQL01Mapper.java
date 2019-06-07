package com.kyiminhan.mm.spring.department.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Interface DeptSQL01Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.mapper </BR>
 * DeptSQL01Mapper.java </BR>
 */
@Mapper
public interface DeptSQL01Mapper {

	/**
	 * Execute.
	 *
	 * @param department the department
	 * @return int
	 */
	int execute(Department department);
}