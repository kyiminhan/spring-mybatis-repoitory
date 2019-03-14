package com.kyiminhan.spring.constant;

/**
 * The Interface URLConstant.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 14, 2019 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.constant </BR>
 *        URLConstant.java </BR>
 */
public interface URLConstant {

	/** The default. */
	String DEFAULT = "/";

	/** The redirect. */
	String REDIRECT = "redirect:/";

	/** The create. */
	String CREATE = "/create";

	/** The edit. */
	String EDIT = "/edit";

	/** The detail. */
	String DETAIL = "/detail";

	/** The param edit. */
	String PARAM_EDIT = "/{id}/edit";

	/** The param detail. */
	String PARAM_DETAIL = "/{id}/detail";

	/** The list. */
	String LIST = "/list";

	/** The delete. */
	String DELETE = "/delete";

	/** The param delete. */
	String PARAM_DELETE = "/{id}/delete";

}