package com.huang.web.controller;

import com.huang.web.JsonResult;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

@RestController
@ComponentScan("com.huang.biz.service.impl")
public class OrderDeliveryController {
    @PostMapping
    public JsonResult setDeliveryNumber(){
        JsonResult result=new JsonResult(1);
        result.setMessage("成功");
        return new JsonResult();
    }
}
