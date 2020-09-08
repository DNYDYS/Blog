package com.blog.mapper;

import com.blog.model.Schedule;
import com.blog.model.ScheduleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScheduleMapper {
    int countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Long schId);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExampleWithBLOBs(ScheduleExample example);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Long schId);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExampleWithBLOBs(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKeyWithBLOBs(Schedule record);

    int updateByPrimaryKey(Schedule record);
}