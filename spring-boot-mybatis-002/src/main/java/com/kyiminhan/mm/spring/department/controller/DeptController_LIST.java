package com.kyiminhan.mm.spring.department.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;
import com.kyiminhan.mm.spring.domain.Department;

/**
 * The Class DeptController_LIST.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_LIST.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DeptController_LIST {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

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
		return "/department/list";
	}
}