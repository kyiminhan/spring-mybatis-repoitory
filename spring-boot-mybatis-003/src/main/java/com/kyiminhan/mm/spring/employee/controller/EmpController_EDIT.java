package com.kyiminhan.mm.spring.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.domain.Employee;
import com.kyiminhan.mm.spring.employee.service.EmployeeService;

/**
 * The Class EmpController_EDIT.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.employee.controller </BR>
 * EmpController_EDIT.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmpController_EDIT {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Edits the.
	 *
	 * @param id the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/{id}/edit")
	public String edit(@PathVariable("id") final String id, final Model model) {
		model.addAttribute("employee", this.employeeService.findById(Integer.valueOf(id)));
		return "/employee/edit";
	}

	/**
	 * Edits the.
	 *
	 * @param id the id
	 * @param employee the employee
	 * @param bindingResult the binding result
	 * @param model the model
	 * @return String
	 */
	@PostMapping(value = "/{id}/edit")
	public String edit(@PathVariable("id") final String id, @ModelAttribute final Employee employee,
			final BindingResult bindingResult, final Model model) {
		this.employeeService.update(employee);
		return "redirect:/employee/{id}/edit";
	}
}