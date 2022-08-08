package com.chen.gracefulcontroller.grace.pojo.vo;

import com.chen.gracefulcontroller.grace.global.myEnum.ResultCode;
import com.chen.gracefulcontroller.grace.global.myEnum.StatusCode;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-19
 */
@Data
public class ResultVo<T> {

    private Integer code;
    private String msg;
    private T data;

    // 手动设置返回vo
    public ResultVo(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 默认返回成功状态码，数据对象
    public ResultVo(T data){
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.data = data;
    }

    // 返回指定状态码，数据对象
    public ResultVo(StatusCode statusCode, T data){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    // 只返回状态码
    public ResultVo(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = null;
    }

}
