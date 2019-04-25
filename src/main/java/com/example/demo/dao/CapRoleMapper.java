package com.example.demo.dao;

import com.example.demo.entity.CapRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CapRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(CapRole record);

    int insertSelective(CapRole record);

    CapRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(CapRole record);

    int updateByPrimaryKey(CapRole record);
}