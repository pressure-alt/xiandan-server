package com.huang.dao.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    /** 订单id */
    private Long orderId;

    /** 卖家id */
    private Long sellerId;

    /** 买家id */
    private Long buyerId;

    /** 订单商品id */
    private Long gid;

    /** 下单时间 */
    private Date orderTime;
    /** 订单状态(0 未付款 1 已付款 2 已发货 3已签收 4订单完成) */
    private Long orderStatus;

    /** 商品总价 */
    private BigDecimal price;


}
