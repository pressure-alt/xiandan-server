package com.huang.web.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("order/")
public class OrderController {
}
