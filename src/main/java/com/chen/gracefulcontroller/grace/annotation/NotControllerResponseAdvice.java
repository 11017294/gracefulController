package com.chen.gracefulcontroller.grace.annotation;

import java.lang.annotation.*;

/**
 * <p>
 * 添加注解的类 方法返回都进行统一封装
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-09 09-41
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotControllerResponseAdvice {
}
