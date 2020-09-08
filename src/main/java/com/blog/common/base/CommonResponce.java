package com.blog.common.base;


import com.blog.common.code.ENUM_CODE;
import lombok.*;

/**
 * @className: CommonResponce
 * @classPath: com.blog.common.base
 * @desc: [ 统一返回值 ]
 * @author: maiBangMin
 * @date: 2020/9/8 10:26 下午
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class CommonResponce<T> {

    private int code;
    private String mag;
    private T data;

    /**
     * @desc:   成功-返回系统状态
     * @param
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:30 下午
     */
    public CommonResponce<T> SUCCESS(){
        return new CommonResponce<T>(ENUM_CODE.SUCCESS.getCode(),ENUM_CODE.SUCCESS.getMsg(),null);
    }

    /**
     * @desc:   成功自定义返回数据
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:34 下午
     */
    public CommonResponce<T> SUCCESS(T data){
        return new CommonResponce<T>(ENUM_CODE.SUCCESS.getCode(),ENUM_CODE.SUCCESS.getMsg(),data);
    }

    /**
     * @desc: 成功-自定义返回信息和数据
     * @param msg
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:35 下午
     */
    public CommonResponce<T> SUCCESS(String msg,T data){
        return new CommonResponce<T>(ENUM_CODE.SUCCESS.getCode(),msg,data);
    }

    /**
     * @desc: 成功-自定义返回状态码和信息及数据
     * @param code
     * @param msg
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:39 下午
     */
    public CommonResponce<T> SUCCESS(int code,String msg,T data){
        return new CommonResponce<T>(code,msg,data);
    }

    /**
     * @desc: 失败-返回系统状态
     * @param
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:41 下午
     */
    public CommonResponce<T> FAILED(){
        return new CommonResponce<T>(ENUM_CODE.FAIL.getCode(),ENUM_CODE.FAIL.getMsg(),null);
    }

    /**
     * @desc: 失败-自定义返回数据
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:42 下午
     */
    public CommonResponce<T> FAILED(T data){
        return new CommonResponce<T>(ENUM_CODE.FAIL.getCode(),ENUM_CODE.FAIL.getMsg(),data);
    }

    /**
     * @desc: 失败-自定义返回信息和数据
     * @param msg
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:43 下午
     */
    public CommonResponce<T> FAILED(String msg,T data){
        return new CommonResponce<T>(ENUM_CODE.FAIL.getCode(),msg,data);
    }

    /**
     * @desc: 失败-自定义返回状态码和信息及数据
     * @param code
     * @param msg
     * @param data
     * @return: CommonResponce<T>
     * @author: maiBangMin
     * @date: 2020/9/8 10:44 下午
     */
    public CommonResponce<T> FAILED(int code,String msg,T data){
        return new CommonResponce<T>(code,msg,data);
    }


}
