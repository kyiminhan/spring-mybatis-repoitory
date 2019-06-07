package com.kyiminhan.mm.spring.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DeptController_CREATE.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_CREATE.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DeptController_CREATE {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

	/**
	 * Creates the.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/create")
	public String create(final Model model) {
		model.addAttribute("department", new Department());
		return "/department/create";
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
		return "redirect:/department/create";
	}
}