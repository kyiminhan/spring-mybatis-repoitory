package com.kyiminhan.spring.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the department name.
 *
 * @return the department name
 */
@Getter

/**
 * Sets the department name.
 *
 * @param departmentName the new department name
 */
@Setter

/*
 * (non-Javadoc)
 *
 * @see java.lang.Object#toString()
 */
@Builder

/**
 * Instantiates a new department.
 */
@NoArgsConstructor

/**
 * Instantiates a new department.
 *
 * @param id             the id
 * @param departmentName the department name
 */
@AllArgsConstructor
public class Department implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;

	/** The department name. */
	private String departmentName;
}