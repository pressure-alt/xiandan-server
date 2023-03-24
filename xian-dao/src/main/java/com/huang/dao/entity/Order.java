package com.huang.dao.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Order {
    Integer order_id;
    Integer seller_id;
    Integer buyer_id;
    Integer gid;
    Date order_time;
    Double price;


}
