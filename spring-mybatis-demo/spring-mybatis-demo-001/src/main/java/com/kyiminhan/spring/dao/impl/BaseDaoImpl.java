package com.kyiminhan.spring.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import com.kyiminhan.spring.dao.BaseDao;
import com.kyiminhan.spring.dao.mapper.BaseMapper;

import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * The Class BaseDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <KYIMINHAN> the generic type
 * @since 2019/03/14 </BR>
 * spring-mybatis-demo-001 system </BR>
 * com.kyiminhan.spring.dao.impl </BR>
 * BaseDaoImpl.java </BR>
 */

/**
 * Instantiates a new base dao impl.
 *
 * @param baseMapper the base mapper
 */
@AllArgsConstructor
public abstract class BaseDaoImpl<KYIMINHAN extends Serializable> implements BaseDao<KYIMINHAN> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The base mapper. */
	@NonNull
	private final BaseMapper<KYIMINHAN> baseMapper;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.KYIMINHANDao#save(com.kyiminhan.spring.entity.
	 * KYIMINHAN)
	 */
	@Override
	public int save(KYIMINHAN KYIMINHAN) {
		return this.baseMapper.save(KYIMINHAN);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.dao.KYIMINHANDao#update(com.kyiminhan.spring.entity.
	 * KYIMINHAN)
	 */
	@Override
	public int update(KYIMINHAN KYIMINHAN) {
		return this.baseMapper.update(KYIMINHAN);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.kyiminhan.spring.dao.KYIMINHANDao#delete(com.kyiminhan.spring.entity.
	 * KYIMINHAN)
	 */
	@Override
	public void delete(KYIMINHAN KYIMINHAN) {
		this.baseMapper.delete(KYIMINHAN);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.spring.dao.KYIMINHANDao#getAll()
	 */
	@Override
	public Collection<KYIMINHAN> getAll() {
		return this.baseMapper.getAll();
	}
}
