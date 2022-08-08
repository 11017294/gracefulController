package com.chen.gracefulcontroller.grace.controller;

import com.chen.gracefulcontroller.grace.pojo.vo.ProductInfoQueryVo;
import com.chen.gracefulcontroller.grace.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-15
 */
@RestController
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/findById")
    public ProductInfoQueryVo findById(Integer id) {
        return productInfoService.findById(id);
    }

    @GetMapping("/list")
    public List<ProductInfoQueryVo> getList(@Validated ProductInfoQueryVo productInfoQueryVo) {
        return productInfoService.getList(productInfoQueryVo);
    }
}
