package com.huang.dao.entity;

import lombok.Data;

@Data
public class OrderDeliveryDetail {
    /** 订单id */
    private Long orderId;

    /** 快递单号 */
    private String expressNo;

    /** 物流状态 */
    private String deliveryStatus;
}
