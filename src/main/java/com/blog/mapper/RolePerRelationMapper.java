package com.blog.mapper;

import com.blog.model.RolePerRelation;
import com.blog.model.RolePerRelationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RolePerRelationMapper {
    int countByExample(RolePerRelationExample example);

    int deleteByExample(RolePerRelationExample example);

    int deleteByPrimaryKey(Long relId);

    int insert(RolePerRelation record);

    int insertSelective(RolePerRelation record);

    List<RolePerRelation> selectByExample(RolePerRelationExample example);

    RolePerRelation selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") RolePerRelation record, @Param("example") RolePerRelationExample example);

    int updateByExample(@Param("record") RolePerRelation record, @Param("example") RolePerRelationExample example);

    int updateByPrimaryKeySelective(RolePerRelation record);

    int updateByPrimaryKey(RolePerRelation record);
}