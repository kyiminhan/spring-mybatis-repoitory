package com.kyiminhan.mm.spring.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DeptController_EDIT.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_EDIT.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DeptController_EDIT {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

	/**
	 * Edits the.
	 *
	 * @param id the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/edit")
	public String edit(@ModelAttribute("id") final String id, final Model model) {
		model.addAttribute("department", this.departmentService.findById(Integer.valueOf(id)));
		return "/department/edit";
	}

	/**
	 * Edits the.
	 *
	 * @param department the department
	 * @param bindingResult the binding result
	 * @param attributes the attributes
	 * @return String
	 */
	@PostMapping(value = "/edit")
	public String edit(@ModelAttribute("department") final Department department, final BindingResult bindingResult,
			final RedirectAttributes attributes) {
		this.departmentService.update(department);
		attributes.addFlashAttribute("id", department.getId());
		return "redirect:/department/edit";
	}
}