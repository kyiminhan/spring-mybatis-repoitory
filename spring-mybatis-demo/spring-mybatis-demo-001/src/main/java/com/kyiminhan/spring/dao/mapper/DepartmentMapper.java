package com.kyiminhan.spring.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kyiminhan.spring.entity.Department;

/**
 * The Interface DepartmentMapper.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/03/14 </BR>
 *        spring-mybatis-demo-001 system </BR>
 *        com.kyiminhan.spring.dao.mapper </BR>
 *        DepartmentMapper.java </BR>
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

}