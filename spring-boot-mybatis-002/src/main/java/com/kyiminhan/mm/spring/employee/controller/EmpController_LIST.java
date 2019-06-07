package com.kyiminhan.mm.spring.employee.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.domain.Employee;
import com.kyiminhan.mm.spring.employee.service.EmployeeService;

/**
 * The Class EmpController_LIST.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.employee.controller </BR>
 * EmpController_LIST.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmpController_LIST {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * List.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = { "/", "/list" })
	public String list(final Model model) {
		final Collection<Employee> employees = this.employeeService.getAll();
		model.addAttribute("employees", employees);
		return "/employee/list";
	}
}