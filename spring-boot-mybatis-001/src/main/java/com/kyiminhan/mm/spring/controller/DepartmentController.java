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

import com.kyiminhan.mm.spring.entity.Department;
import com.kyiminhan.mm.spring.service.DepartmentService;

/**
 * The Class DepartmentController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/06 </BR>
 * spring-boot-mybatis-001 system </BR>
 * com.kyiminhan.mm.spring.controller </BR>
 * DepartmentController.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DepartmentController {

	/** The department service. */
	private DepartmentService departmentService;

	/**
	 * Sets the department service.
	 *
	 * @param departmentService the new department service
	 */
	@Autowired
	public void setDepartmentService(final DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * Forward.
	 *
	 * @param pageName the page name
	 * @return String
	 */
	private String forward(final String pageName) {
		return new StringBuilder("/department").append("/").append(pageName).toString();
	}

	/**
	 * Redirect.
	 *
	 * @param url the url
	 * @return String
	 */
	private String redirect(final String url) {
		return new StringBuilder("redirect:").append("/department").append(url).toString();
	}

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/create")
	public String create(final Model model) {
		model.addAttribute("department", new Department());
		return this.forward("create");
	}

	/**
	 * Creates the.
	 *
	 * @param department the department
	 * @param bindingResult the binding result
	 * @param model the model
	 * @return String
	 */
	@PostMapping(value = "/create")
	public String create(@ModelAttribute(value = "department") final Department department,
			final BindingResult bindingResult, final Model model) {
		this.departmentService.save(department);
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
		model.addAttribute("department", this.departmentService.findById(Integer.valueOf(id)));
		return this.forward("edit");
	}

	/**
	 * Edits the.
	 *
	 * @param id the id
	 * @param department the department
	 * @param bindingResult the binding result
	 * @param model the model
	 * @return String
	 */
	@PostMapping(value = "/{id}/edit")
	public String edit(@PathVariable("id") final String id, @ModelAttribute final Department department,
			final BindingResult bindingResult, final Model model) {
		this.departmentService.update(department);
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
		model.addAttribute("department", this.departmentService.findById(Integer.valueOf(id)));
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
		this.departmentService.delete(this.departmentService.findById(Integer.valueOf(id)));
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
		final Collection<Department> departments = this.departmentService.getAll();
		model.addAttribute("departments", departments);
		return this.forward("list");
	}
}