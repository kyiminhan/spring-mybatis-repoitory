package com.kyiminhan.mm.spring.department.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DeptController_LIST.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_LIST.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
@SessionAttributes(names = "departments")
public class DeptController_LIST {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

	/**
	 * Nav to edit.
	 *
	 * @param id the id
	 * @param attributes the attributes
	 * @return String
	 */
	@GetMapping(value = "/{id}/edit")
	public String navToEdit(@PathVariable("id") final String id, final RedirectAttributes attributes) {
		attributes.addFlashAttribute("id", id);
		return "redirect:/department/edit";
	}

	/**
	 * Nav to detail.
	 *
	 * @param id the id
	 * @param attributes the attributes
	 * @return String
	 */
	@GetMapping(value = "/{id}/detail")
	public String navToDetail(@PathVariable("id") final String id, final RedirectAttributes attributes) {
		attributes.addFlashAttribute("id", id);
		return "redirect:/department/detail";
	}

	/**
	 * Nav to delete.
	 *
	 * @param id the id
	 * @param attributes the attributes
	 * @return String
	 */
	@GetMapping(value = "/{id}/delete")
	public String navToDelete(@PathVariable("id") final String id, final RedirectAttributes attributes) {
		attributes.addFlashAttribute("id", id);
		return "redirect:/department/delete";
	}

	/**
	 * List.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = { "", "/", "/list" })
	public String list(final Model model) {
		final Collection<Department> departments = this.departmentService.getAll();
		model.addAttribute("departments", departments);
		return "/department/list";
	}
}