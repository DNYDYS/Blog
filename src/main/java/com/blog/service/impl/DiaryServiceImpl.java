package com.blog.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.blog.common.base.CommonResponce;
import com.blog.mapper.DiaryMapper;
import com.blog.model.Diary;
import com.blog.model.DiaryExample;
import com.blog.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.blog.common.code.Constants.*;

/**
 * @className: DiaryServiceImpl
 * @classPath: com.blog.service.impl
 * @desc: [ 日报-Service-Impl ]
 * @author: maiBangMin
 * @date: 2020/9/6 11:06 下午
 */
@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryMapper diaryMapper;

    /**
     * @desc:   查询所有未删除的日志
     * @param
     * @return: List<Diary>
     * @author: maiBangMin
     * @date: 2020/9/6 11:12 下午
     */
    @Override
    public CommonResponce<List<Diary>> queryAllDiarys() {
        CommonResponce<List<Diary>> responce = new CommonResponce<>();
        List<Diary> diaryList = new ArrayList<>();
        DiaryExample diaryExample = new DiaryExample();
        // Y 代表删除 N 代表未删除
        diaryExample.createCriteria().andIsDeletedEqualTo(N);
        diaryList = diaryMapper.selectByExample(diaryExample);
        if(CollectionUtil.isNotEmpty(diaryList)){
            responce.SUCCESS(diaryList);
        }
        return responce.FAILED();
    }

    /**
     * @desc:   查询单条日志(根据diaryId)
     * @param diaryID
     * @return: Diary
     * @author: maiBangMin
     * @date: 2020/9/6 11:16 下午
     */
    @Override
    public CommonResponce<Diary> queryOneDiary(Long diaryID) {
        CommonResponce<Diary> responce = new CommonResponce<>();
        Diary diary = new Diary();
        DiaryExample diaryExample = new DiaryExample();
        if(null != diaryID) {
            diaryExample.createCriteria().andIsDeletedEqualTo("Y").andDirIdEqualTo(diaryID);
        }
        List<Diary> diaryList = diaryMapper.selectByExample(diaryExample);
        if(CollectionUtil.isNotEmpty(diaryList)){
            return responce.SUCCESS(diaryList.get(0));
        }
        return responce.FAILED();
    }

    /**
     * @desc:
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:21 下午
     */
    @Override
    public CommonResponce insDiary(Diary diary) {
        CommonResponce responce = new CommonResponce();
        if(null != diary){
            diary.setIsDeleted(N);
            // TODO  获取时间工具类添加，并替换
            diary.setCreaterTime(new Date());
            diary.setCreaterUser(System);
            diary.setUpdateUser(System);
            diary.setUpdateTime(new Date());
            int insResult = diaryMapper.insert(diary);
            if(insResult > 1){
                return responce.SUCCESS();
            }
        }
        return responce.FAILED();
    }

    /**
     * @desc:
     * @param diary
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:23 下午
     */
    @Override
    public CommonResponce upDiary(Diary diary) {
        CommonResponce responce = new CommonResponce();
        if(null != diary) {
            diary.setUpdateUser(System);
            diary.setUpdateTime(new Date());
            int upResult = diaryMapper.updateByPrimaryKeySelective(diary);
            if(upResult > 1){
                return responce.SUCCESS();
            }
        }
        return responce.FAILED();
    }

    /**
     * @desc:
     * @param diaryID
     * @return: int
     * @author: maiBangMin
     * @date: 2020/9/6 11:28 下午
     */
    @Override
    public CommonResponce delDiary(Long diaryID) {
        CommonResponce responce = new CommonResponce();
        if(null != diaryID){
            DiaryExample diaryExample = new DiaryExample();
            diaryExample.createCriteria().andDirIdEqualTo(diaryID).andIsDeletedEqualTo(N);
            List<Diary> diaryList = diaryMapper.selectByExample(diaryExample);
            if(CollectionUtil.isNotEmpty(diaryList)){
                Diary diary = diaryList.get(ZERO);
                diary.setIsDeleted(Y);
                diary.setUpdateUser(System);
                diary.setUpdateTime(new Date());
                int  upResult = diaryMapper.updateByPrimaryKey(diary);
                if(upResult > 1){
                    return responce.SUCCESS();
                }
            }
        }
        return responce.FAILED();
    }


}
