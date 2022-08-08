package com.chen.gracefulcontroller.grace.global.restControllerAdvice;

import com.chen.gracefulcontroller.grace.global.myEnum.ResultCode;
import com.chen.gracefulcontroller.grace.pojo.vo.ResultVo;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 10-30
 */
@RestControllerAdvice(basePackages = {"com.chen.gracefulcontroller.grace.controller"})
public class ControllerExceptionAdvice {

    @ExceptionHandler({BindException.class})
    public ResultVo MethodArgumentNotValidExceptionHandler(BindException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
    }

}
