package com.blog.controller;

import com.blog.common.base.AspectAnno;
import com.blog.common.base.CommonResponce;
import com.blog.model.Diary;
import com.blog.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @className: DiaryController
 * @classPath: com.blog.controller
 * @desc: [ 日报-Controller ]
 * @author: maiBangMin
 * @date: 2020/9/6 11:29 下午
 */

@RestController
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    DiaryService diaryService;

    /**
     * @desc: 查询所有未删除的日志
     * @param
     * @return: List<Diary>
     * @author: maiBangMin
     * @date: 2020/9/6 11:35 下午
     */
    @GetMapping("/queryAllDiarys")
    @AspectAnno(desc = "查询所有未删除的日志")
    public CommonResponce<List<Diary>> queryAllDiarys(){
        return diaryService.queryAllDiarys();
    }

    /**
     * @desc: 查询单条日志(根据diaryId)
     * @param diaryID
     * @return: Diary
     * @author: maiBangMin
     * @date: 2020/9/6 11:36 下午
     */
    @PostMapping("queryOneDiary")
    @AspectAnno(desc = "查询所有未删除的日志")
    public CommonResponce<Diary> queryOneDiary(@RequestBody Long diaryID){
        return diaryService.queryOneDiary(diaryID);
    }

    /**
     * @desc: 新增一条日志
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:37 下午
     */
    @PostMapping("/insertDiary")
    @AspectAnno(desc = "新增一条日志")
    public CommonResponce insDiary(@RequestBody Diary diary){
        return diaryService.insDiary(diary);
    }

    /**
     * @desc: 修改日志
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:38 下午
     */
    @PostMapping("/upDiary")
    @AspectAnno(desc = "修改日志")
    public CommonResponce upDiary(@RequestBody Diary diary){
        return diaryService.upDiary(diary);
    }

    /**
     * @desc: 删除日志
     * @param diaryID
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:39 下午
     */
    @PostMapping("/delDiary")
    @AspectAnno(desc = "删除日志")
    public CommonResponce delDiary(@RequestBody Long diaryID){
        return diaryService.delDiary(diaryID);
    }

}
