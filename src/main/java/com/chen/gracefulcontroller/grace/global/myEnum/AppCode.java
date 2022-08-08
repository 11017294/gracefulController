package com.chen.gracefulcontroller.grace.global.myEnum;

import lombok.Getter;

/**
 * <p>
 *  异常状态枚举
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 10-43
 */
@Getter
public enum AppCode implements StatusCode{

    APP_ERROR(2000, "业务异常"),
    PRICE_ERROR(2001, "价格异常");

    private Integer code;
    private String msg;

    AppCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
