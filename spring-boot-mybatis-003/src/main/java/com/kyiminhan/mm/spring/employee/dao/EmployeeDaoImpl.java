package com.kyiminhan.mm.spring.employee.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.mm.spring.domain.Employee;
import com.kyiminhan.mm.spring.employee.mapper.EmpSQL01Mapper;
import com.kyiminhan.mm.spring.employee.mapper.EmpSQL02Mapper;
import com.kyiminhan.mm.spring.employee.mapper.EmpSQL03Mapper;
import com.kyiminhan.mm.spring.employee.mapper.EmpSQL04Mapper;
import com.kyiminhan.mm.spring.employee.mapper.EmpSQL05Mapper;

/**
 * The Class EmployeeDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.employee.dao </BR>
 * EmployeeDaoImpl.java </BR>
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	/** The emp SQL 01 mapper. */
	@Autowired
	private EmpSQL01Mapper empSQL01Mapper;
	
	/** The emp SQL 02 mapper. */
	@Autowired
	private EmpSQL02Mapper empSQL02Mapper;
	
	/** The emp SQL 03 mapper. */
	@Autowired
	private EmpSQL03Mapper empSQL03Mapper;
	
	/** The emp SQL 04 mapper. */
	@Autowired
	private EmpSQL04Mapper empSQL04Mapper;
	
	/** The emp SQL 05 mapper. */
	@Autowired
	private EmpSQL05Mapper empSQL05Mapper;

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int save(final Employee employee) {
		return this.empSQL01Mapper.execute(employee);
	}

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int update(final Employee employee) {
		return this.empSQL02Mapper.execute(employee);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	@Override
	public Employee findById(final Integer id) {
		return this.empSQL03Mapper.execute(id);
	}

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	@Override
	public void delete(final Employee employee) {
		this.empSQL04Mapper.execute(employee);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.empSQL05Mapper.execute();
	}
}