package com.kyiminhan.spring.dao.mapper;

import java.io.Serializable;
import java.util.Collection;

/**
 * The Interface BaseMapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <KYIMINHAN> the generic type
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.dao.mapper </BR>
 *        BaseMapper.java </BR>
 */
public interface BaseMapper<KYIMINHAN extends Serializable> extends Serializable {

	/**
	 * Save.
	 *
	 * @param kyiminhan the kyiminhan
	 * @return int
	 */
	int save(KYIMINHAN kyiminhan);

	/**
	 * Update.
	 *
	 * @param kyiminhan the kyiminhan
	 * @return int
	 */
	int update(KYIMINHAN kyiminhan);

	/**
	 * Delete.
	 *
	 * @param kyiminhan the kyiminhan
	 * @return int
	 */
	int delete(KYIMINHAN kyiminhan);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<KYIMINHAN> getAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return KYIMINHAN
	 */
	KYIMINHAN findById(Integer id);
}