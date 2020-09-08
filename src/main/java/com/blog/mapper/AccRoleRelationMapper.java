package com.blog.mapper;

import com.blog.model.AccRoleRelation;
import com.blog.model.AccRoleRelationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccRoleRelationMapper {
    int countByExample(AccRoleRelationExample example);

    int deleteByExample(AccRoleRelationExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(AccRoleRelation record);

    int insertSelective(AccRoleRelation record);

    List<AccRoleRelation> selectByExample(AccRoleRelationExample example);

    AccRoleRelation selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") AccRoleRelation record, @Param("example") AccRoleRelationExample example);

    int updateByExample(@Param("record") AccRoleRelation record, @Param("example") AccRoleRelationExample example);

    int updateByPrimaryKeySelective(AccRoleRelation record);

    int updateByPrimaryKey(AccRoleRelation record);
}