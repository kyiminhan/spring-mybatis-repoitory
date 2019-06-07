package com.kyiminhan.mm.spring.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kyiminhan.mm.spring.employee.service.EmployeeService;

/**
 * The Class EmpController_DELETE.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-003 system </BR>
 * com.kyiminhan.mm.spring.employee.controller </BR>
 * EmpController_DELETE.java </BR>
 */
@Controller
@RequestMapping(path = "/employee")
public class EmpController_DELETE {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @param attributes the attributes
	 * @return String
	 */
	@GetMapping(value = "/delete")
	public String delete(@ModelAttribute("id") final String id, final RedirectAttributes attributes) {
		this.employeeService.delete(this.employeeService.findById(Integer.valueOf(id)));
		return "redirect:/employee/list";
	}

}