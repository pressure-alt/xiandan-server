package com.huang.dao.entity;

import lombok.Data;

@Data
public class ShoppingCart {
    /** 用户id */
    private Long userId;

    /** 商品id */
    private Long gid;

    /** 数量 */
    private Long num;
}
