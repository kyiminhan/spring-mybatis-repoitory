package com.kyiminhan.spring.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
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
public class Department implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;

	/** The department name. */
	private String departmentName;
}