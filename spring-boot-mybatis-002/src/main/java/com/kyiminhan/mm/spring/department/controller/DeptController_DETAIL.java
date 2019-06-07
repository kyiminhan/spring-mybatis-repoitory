package com.kyiminhan.mm.spring.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.department.service.DepartmentServiceImpl;

/**
 * The Class DeptController_DETAIL.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.department.controller </BR>
 * DeptController_DETAIL.java </BR>
 */
@Controller
@RequestMapping(path = "/department")
public class DeptController_DETAIL {

	/** The department service. */
	@Autowired
	private DepartmentServiceImpl departmentService;

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
		return "/department/detail";
	}
}