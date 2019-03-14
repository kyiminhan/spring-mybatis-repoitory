package com.kyiminhan.spring.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Employee.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/13 </BR>
 * spring-mybatis-demo-001 system </BR>
 * com.kyiminhan.spring.entity </BR>
 * Employee.java </BR>
 */

/**
 * Gets the phone.
 *
 * @return the phone
 */
@Getter

/**
 * Sets the phone.
 *
 * @param phone the new phone
 */
@Setter

/*
 * (non-Javadoc)
 * 
 * @see java.lang.Object#toString()
 */
@Builder

/*
 * (non-Javadoc)
 * 
 * @see java.lang.Object#hashCode()
 */
@EqualsAndHashCode

/**
 * Instantiates a new employee.
 */
@NoArgsConstructor

/**
 * Instantiates a new employee.
 *
 * @param id      the id
 * @param name    the name
 * @param email   the email
 * @param address the address
 * @param phone   the phone
 */
@AllArgsConstructor
public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The email. */
	private String email;

	/** The address. */
	private String address;

	/** The phone. */
	private String phone;

}