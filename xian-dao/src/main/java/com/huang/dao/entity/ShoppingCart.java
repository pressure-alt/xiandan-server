package com.huang.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("shoppingcart")
public class ShoppingCart {
    /** 用户id */
    private Long userId;

    /** 商品id */
    private Long gid;

    /** 数量 */
    private Long num;
}
