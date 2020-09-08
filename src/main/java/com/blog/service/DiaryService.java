package com.blog.service;


import com.blog.common.base.CommonResponce;
import com.blog.model.Diary;

import java.util.List;

/**
 * @className: DiaryService
 * @classPath: com.blog.service
 * @desc: [ 日报-IService ]
 * @author: maiBangMin
 * @date: 2020/9/6 11:00 下午
 */
public interface DiaryService {

    /**
     * @desc:
     * @param null
     * @return: null
     * @author: maiBangMin
     * @date: 2020/9/6 11:03 下午
     */
    CommonResponce<List<Diary>> queryAllDiarys();

    /**
     * @desc:
     * @param diaryID
     * @return: null
     * @author: maiBangMin
     * @date: 2020/9/6 11:04 下午
     */
    CommonResponce<Diary> queryOneDiary(Long diaryID);

    /**
     * @desc:
     * @param diary
     * @return: null
     * @author: maiBangMin
     * @date: 2020/9/6 11:04 下午
     */
    CommonResponce insDiary(Diary diary);

    /**
     * @desc:
     * @param diary
     * @return: null
     * @author: maiBangMin
     * @date: 2020/9/6 11:05 下午
     */
    CommonResponce upDiary(Diary diary);

    /**
     * @desc:
     * @param diaryID
     * @return: null
     * @author: maiBangMin
     * @date: 2020/9/6 11:05 下午
     */
    CommonResponce delDiary(Long diaryID);

}
