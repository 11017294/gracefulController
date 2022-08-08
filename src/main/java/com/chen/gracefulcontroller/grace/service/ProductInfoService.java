package com.chen.gracefulcontroller.grace.service;

import com.chen.gracefulcontroller.grace.global.myEnum.AppCode;
import com.chen.gracefulcontroller.grace.global.myException.APIException;
import com.chen.gracefulcontroller.grace.pojo.vo.ProductInfoQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-34
 */
@Service
public class ProductInfoService {

    public ProductInfoQueryVo findById(Integer id) {
        if(id == null) {
            throw new APIException(AppCode.ORDER_NOT_EXIST, "订单号不存在：" + id);
        }
        ProductInfoQueryVo productInfoQueryVo = new ProductInfoQueryVo();
        productInfoQueryVo.setProductId(id);
        productInfoQueryVo.setProductName("测试");
        return productInfoQueryVo;
    }

    public List<ProductInfoQueryVo> getList(ProductInfoQueryVo productInfo) {
        ProductInfoQueryVo productInfoQueryVo = new ProductInfoQueryVo();
        BeanUtils.copyProperties(productInfo, productInfoQueryVo);
        return new ArrayList<ProductInfoQueryVo>(){{
            add(productInfoQueryVo);
            add(productInfoQueryVo);
            add(productInfoQueryVo);
            add(productInfoQueryVo);
            add(productInfoQueryVo);
        }};
    }
}
