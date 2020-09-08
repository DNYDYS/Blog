package com.blog.common.code;

import lombok.Getter;

@Getter
public enum ENUM_CODE {


    SUCCESS(200,"操作成功"),
    FAIL(500,"操作失败");

    private int code;
    private String msg;

    ENUM_CODE(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
