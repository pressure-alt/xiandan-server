package com.huang.dao.mapper;

import com.huang.dao.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> getOrderListByUserId(@Param("id") int id);
    boolean setDeliveryNumber(String deliveryNum);
}
