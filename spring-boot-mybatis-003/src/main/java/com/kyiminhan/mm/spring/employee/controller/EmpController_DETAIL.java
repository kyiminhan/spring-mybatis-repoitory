package com.kyiminhan.mm.spring.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyiminhan.mm.spring.employee.service.EmployeeService;

/**
 * The Class EmpController_DETAIL.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.employee.controller </BR>
 * EmpController_DETAIL.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmpController_DETAIL {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Detail.
	 *
	 * @param id the id
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = "/detail")
	public String detail(@ModelAttribute("id") final String id, final Model model) {
		model.addAttribute("employee", this.employeeService.findById(Integer.valueOf(id)));
		return "/employee/detail";
	}
}