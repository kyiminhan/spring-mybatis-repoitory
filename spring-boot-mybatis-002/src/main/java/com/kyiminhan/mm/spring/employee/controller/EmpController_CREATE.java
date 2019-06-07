package com.kyiminhan.mm.spring.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.domain.Employee;
import com.kyiminhan.mm.spring.employee.service.EmployeeService;

/**
 * The Class EmpController_CREATE.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.employee.controller </BR>
 * EmpController_CREATE.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmpController_CREATE {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/create")
	public String create(final Model model) {
		model.addAttribute("employee", new Employee());
		return "/employee/create";
	}

	/**
	 * Creates the.
	 *
	 * @param employee the employee
	 * @param bindingResult the binding result
	 * @param model the model
	 * @return String
	 */
	@PostMapping(value = "/create")
	public String create(@ModelAttribute(value = "employee") final Employee employee, final BindingResult bindingResult,
			final Model model) {
		this.employeeService.save(employee);
		return "redirect:/employee/create";
	}
}