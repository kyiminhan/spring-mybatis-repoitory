package com.kyiminhan.mm.spring.employee.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.mm.spring.domain.Employee;

/**
 * The Interface EmpSQL05Mapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.employee.mapper </BR>
 * EmpSQL05Mapper.java </BR>
 */
@Mapper
public interface EmpSQL05Mapper {

	/**
	 * Execute.
	 *
	 * @return Collection
	 */
	Collection<Employee> execute();
}