package com.huang.web.controller;

import com.huang.biz.service.OrderService;
import com.huang.dao.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("order/")
public class OrderController {
    private final Lock lock = new ReentrantLock();
    @Autowired
    private OrderService orderService;
    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) throws InterruptedException {
        lock.lock();
        try {
            //下订单操作
            orderService.placeOrder(order);
            return ResponseEntity.ok("Order placed successfully!");
        } finally {
            lock.unlock();
        }
    }

}
