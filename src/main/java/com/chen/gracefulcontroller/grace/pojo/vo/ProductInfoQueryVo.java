package com.chen.gracefulcontroller.grace.pojo.vo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-36
 */
@Data
public class ProductInfoQueryVo {

    private Integer productId;
    @NotNull(message = "商品名称不允许为空")
    private String productName;
    @Min(value = 0, message = "商品价格不允许为负数")
    private BigDecimal productPrice;
    private String productDescription;
    private Integer productStatus;

}
