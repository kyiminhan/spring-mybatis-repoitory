package com.kyiminhan.mm.spring.employee.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Employee;

/**
 * The Interface EmpSQL04Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.employee.mapper </BR>
 * EmpSQL04Mapper.java </BR>
 */
@Mapper
public interface EmpSQL04Mapper {

	/**
	 * Execute.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int execute(Employee employee);
}