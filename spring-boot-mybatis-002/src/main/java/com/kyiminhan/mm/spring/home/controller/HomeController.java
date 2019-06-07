package com.kyiminhan.mm.spring.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Class HomeController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/07 </BR>
 * spring-boot-mybatis-002 system </BR>
 * com.kyiminhan.mm.spring.home.controller </BR>
 * HomeController.java </BR>
 */
@Controller
public class HomeController {

	/**
	 * Home.
	 *
	 * @param model the model
	 * @return String
	 */
	@GetMapping(value = { "/", "/home" })
	public String home(final Model model) {
		return "home";
	}
}