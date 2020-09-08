package com.blog.mapper;

import com.blog.model.StudyNote;
import com.blog.model.StudyNoteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudyNoteMapper {
    int countByExample(StudyNoteExample example);

    int deleteByExample(StudyNoteExample example);

    int deleteByPrimaryKey(Long noteId);

    int insert(StudyNote record);

    int insertSelective(StudyNote record);

    List<StudyNote> selectByExampleWithBLOBs(StudyNoteExample example);

    List<StudyNote> selectByExample(StudyNoteExample example);

    StudyNote selectByPrimaryKey(Long noteId);

    int updateByExampleSelective(@Param("record") StudyNote record, @Param("example") StudyNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") StudyNote record, @Param("example") StudyNoteExample example);

    int updateByExample(@Param("record") StudyNote record, @Param("example") StudyNoteExample example);

    int updateByPrimaryKeySelective(StudyNote record);

    int updateByPrimaryKeyWithBLOBs(StudyNote record);

    int updateByPrimaryKey(StudyNote record);
}