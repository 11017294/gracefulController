package com.chen.gracefulcontroller.grace;

import com.chen.gracefulcontroller.grace.pojo.vo.ProductInfoQueryVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 10-35
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public ProductInfoQueryVo Test(@Validated ProductInfoQueryVo productInfoQueryVo) {
        return productInfoQueryVo;
    }
}
