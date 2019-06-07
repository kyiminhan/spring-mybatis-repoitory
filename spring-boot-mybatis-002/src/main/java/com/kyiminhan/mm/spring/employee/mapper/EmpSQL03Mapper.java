package com.kyiminhan.mm.spring.employee.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Employee;

/**
 * The Interface EmpSQL03Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.employee.mapper </BR>
 * EmpSQL03Mapper.java </BR>
 */
@Mapper
public interface EmpSQL03Mapper {

	/**
	 * Execute.
	 *
	 * @param id the id
	 * @return Employee
	 */
	Employee execute(Integer id);
}