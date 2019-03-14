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
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.spring.constant.ControllerConstant;
import com.kyiminhan.spring.constant.PathConstant;
import com.kyiminhan.spring.constant.URLConstant;
import com.kyiminhan.spring.entity.Department;
import com.kyiminhan.spring.service.DepartmentService;

import lombok.Setter;

/**
 * The Class DepartmentController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.controller </BR>
 *        DepartmentController.java </BR>
 */
@Controller
@RequestMapping(path = PathConstant.DEPARTMENT_PATH)

/**
 * Sets the department service.
 *
 * @param departmentService the new department service
 */

/**
 * Sets the department service.
 *
 * @param departmentService the new department service
 */
@Setter(onMethod = @__(@Autowired))
public class DepartmentController {

	/** The department service. */
	private DepartmentService departmentService;

	/**
	 * Gets the view.
	 *
	 * @param pageName the page name
	 * @return the view
	 */
	private String getView(String pageName) {
		return new StringBuilder(PathConstant.DEPARTMENT_PATH).append(PathConstant.PATH).append(pageName).toString();
	}

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.CREATE)
	public String create(final Model model) {
		return this.getView(ControllerConstant.CREATE);
	}

	/**
	 * Creates the.
	 *
	 * @param department    the department
	 * @param bindingResult the binding result
	 * @param model         the model
	 * @return String
	 */
	@PostMapping(value = URLConstant.CREATE)
	public String create(@ModelAttribute final Department department, final BindingResult bindingResult,
			final Model model) {
		return this.getView(ControllerConstant.CREATE);
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
		return this.getView(ControllerConstant.EDIT);
	}

	/**
	 * Edits the.
	 *
	 * @param id            the id
	 * @param department    the department
	 * @param bindingResult the binding result
	 * @param model         the model
	 * @return String
	 */
	@PostMapping(value = URLConstant.PARAM_EDIT)
	public String edit(@PathVariable("id") final String id, @ModelAttribute final Department department,
			final BindingResult bindingResult, final Model model) {
		return this.getView(ControllerConstant.EDIT);
	}

	/**
	 * Detail.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.PARAM_DETAIL)
	public String detail(final Model model) {
		return this.getView(ControllerConstant.DETAIL);
	}

	/**
	 * Delete.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = URLConstant.DELETE)
	public String delete(final Model model) {
		return this.getView(ControllerConstant.LIST);
	}

	/**
	 * List.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = { URLConstant.DEFAULT, URLConstant.LIST })
	public String list(final Model model) {
		final Collection<Department> departments = this.departmentService.getAll();
		model.addAttribute(ControllerConstant.EMPLOYEES, departments);
		return this.getView(ControllerConstant.LIST);
	}
}