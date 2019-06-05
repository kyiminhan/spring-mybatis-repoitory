package com.kyiminhan.mm.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.entity.Employee;
import com.kyiminhan.mm.spring.service.EmployeeService;

/**
 * The Class EmployeeController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/05 </BR>
 * spring-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.controller </BR>
 * EmployeeController.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {

	/** The employee service. */
	private EmployeeService employeeService;

	/**
	 * Sets the employee service.
	 *
	 * @param employeeService the new employee service
	 */
	@Autowired
	public void setEmployeeService(final EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Forward.
	 *
	 * @param pageName the page name
	 * @return String
	 */
	private String forward(final String pageName) {
		return new StringBuilder("/employee").append("/").append(pageName).toString();
	}

	/**
	 * Redirect.
	 *
	 * @param url the url
	 * @return String
	 */
	private String redirect(final String url) {
		return new StringBuilder("redirect:").append("/employee").append(url).toString();
	}

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/create")
	public String create(final Model model) {
		model.addAttribute("employee", new Employee());
		return this.forward("create");
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
		return this.redirect("/create");
	}

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
		return this.forward("edit");
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
		return this.redirect("/{id}/edit");
	}

	/**
	 * Detail.
	 *
	 * @param id the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/{id}/detail")
	public String detail(@PathVariable("id") final String id, final Model model) {
		model.addAttribute("employee", this.employeeService.findById(Integer.valueOf(id)));
		return this.forward("detail");
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/{id}/delete")
	public String delete(@PathVariable("id") final String id, final Model model) {
		this.employeeService.delete(this.employeeService.findById(Integer.valueOf(id)));
		return this.redirect("/list");
	}

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
		return this.forward("list");
	}
}