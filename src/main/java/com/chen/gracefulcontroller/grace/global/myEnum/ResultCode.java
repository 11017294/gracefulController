package com.chen.gracefulcontroller.grace.global.myEnum;

import lombok.Getter;

/**
 * <p>
 *  返回状态枚举
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-23
 */
@Getter
public enum ResultCode implements StatusCode {

    SUCCESS(1000, "请求成功"),
    FAILED(1001, "请求失败"),
    VALIDATE_ERROR(1002, "参数校验失败"),
    RESPONSE_PACK_ERROR(1003, "response返回包装失败");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
