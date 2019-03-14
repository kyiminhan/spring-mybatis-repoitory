package com.kyiminhan.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kyiminhan.spring.constant.ControllerConstant;
import com.kyiminhan.spring.constant.URLConstant;
import com.kyiminhan.spring.entity.Employee;
import com.kyiminhan.spring.service.EmployeeService;

import lombok.Setter;

/**
 * The Class EmployeeController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.controller </BR>
 *        EmployeeController.java </BR>
 */
@Controller

/**
 * Sets the employee service.
 *
 * @param employeeService the new employee service
 */
@Setter(onMethod = @__(@Autowired))
public class EmployeeController {

	/** The employee service. */
	private EmployeeService employeeService;

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.CREATE)
	public String create(final Model model) {
		return null;
	}

	/**
	 * Creates the.
	 *
	 * @param employee      the employee
	 * @param bindingResult the binding result
	 * @param model         the model
	 * @return String
	 */
	@PostMapping(value = URLConstant.CREATE)
	public String create(@ModelAttribute final Employee employee, final BindingResult bindingResult,
			final Model model) {
		return null;
	}

	/**
	 * Edits the.
	 *
	 * @param id    the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.PARAM_EDIT)
	public String edit(@PathVariable("id") final String id, final Model model) {
		return null;
	}

	/**
	 * Edits the.
	 *
	 * @param id            the id
	 * @param employee      the employee
	 * @param bindingResult the binding result
	 * @param model         the model
	 * @return String
	 */
	@PostMapping(value = URLConstant.PARAM_EDIT)
	public String edit(@PathVariable("id") final String id, @ModelAttribute final Employee employee,
			final BindingResult bindingResult, final Model model) {
		return null;
	}

	/**
	 * Detail.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.PARAM_DETAIL)
	public String detail(final Model model) {
		return null;
	}

	/**
	 * Delete.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.DELETE)
	public String delete(final Model model) {
		return null;
	}

	/**
	 * List.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = { URLConstant.DEFAULT, URLConstant.LIST })
	public String list(final Model model) {
		final Collection<Employee> employees = this.employeeService.getAll();
		model.addAttribute(ControllerConstant.EMPLOYEES, employees);
		return ControllerConstant.LIST;
	}
}