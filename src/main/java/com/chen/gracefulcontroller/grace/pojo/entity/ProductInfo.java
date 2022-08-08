package com.chen.gracefulcontroller.grace.pojo.entity;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author：MaybeBin
 * @Date: 2022-08-08 09-31
 */
@Data
public class ProductInfo {

    private Integer productId;
    private String productName;
    private Double productPrice;
    private String productDescription;
    private Integer productStatus;

}
