package com.huang.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order_delivery_details")
public class OrderDeliveryDetail {
    /** 订单id */
    private Long orderId;

    /** 快递单号 */
    private String expressNo;

    /** 物流状态 */
    private String deliveryStatus;
}
