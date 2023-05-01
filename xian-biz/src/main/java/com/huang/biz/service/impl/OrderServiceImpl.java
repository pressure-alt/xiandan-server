package com.huang.biz.service.impl;

import com.huang.biz.service.OrderService;
import com.huang.dao.entity.Order;
import com.huang.dao.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public Order placeOrder(Order order) {
        return orderMapper.insertOrder(order);
    }
}
