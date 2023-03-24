package com.huang.web.controller;

import cn.hutool.log.Log;
import com.alibaba.fastjson.JSONObject;
import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping
    public List<Goods> goodsList(){
        return goodsService.goodList(1);
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestBody JSONObject jsonObject)

    {
        System.out.println(jsonObject);
return "1234";

    }
}
