package com.blog.controller;

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
     * @desc:
     * @param
     * @return: List<Diary>
     * @author: maiBangMin
     * @date: 2020/9/6 11:35 下午
     */
    @GetMapping("/queryAllDiarys")
    public List<Diary> queryAllDiarys(){
        return diaryService.queryAllDiarys();
    }

    /**
     * @desc:
     * @param diaryID
     * @return: Diary
     * @author: maiBangMin
     * @date: 2020/9/6 11:36 下午
     */
    @PostMapping("queryOneDiary")
    public Diary queryOneDiary(@RequestBody Long diaryID){
        return diaryService.queryOneDiary(diaryID);
    }

    /**
     * @desc:
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:37 下午
     */
    @PostMapping("/insertDiary")
    public int insDiary(@RequestBody Diary diary){
        return diaryService.insDiary(diary);
    }

    /**
     * @desc:
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:38 下午
     */
    @PostMapping("/upDiary")
    public int upDiary(@RequestBody Diary diary){
        return diaryService.upDiary(diary);
    }

    /**
     * @desc:
     * @param diaryID
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:39 下午
     */
    @PostMapping("/delDiary")
    public int delDiary(@RequestBody Long diaryID){
        return diaryService.delDiary(diaryID);
    }

}
