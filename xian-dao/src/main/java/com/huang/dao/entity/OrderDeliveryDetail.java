package com.huang.dao.entity;

import lombok.Data;

@Data
public class OrderDeliveryDetail {
    /** 订单id */
    private Long orderId;

    /** 快递单号 */
    private String expressNo;

    /** 订单状态(0 未付款 1 已付款 2 已发货 3已签收 4订单完成) */
    private Long orderStatus;

    /** 物流状态 */
    private String deliveryStatus;
}
