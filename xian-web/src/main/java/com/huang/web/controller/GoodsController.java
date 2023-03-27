package com.huang.web.controller;

import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.web.JsonResult;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
@Slf4j
@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;

    @RequestMapping("/list")
    public List<Goods> goodsList() {
        return goodsService.goodList(1);
    }

    @ResponseBody
    @RequestMapping("/upload")
    public JsonResult uploadGoods(@RequestBody Goods goods) {
        long goodsId=   goodsService.insertGoods(goods);
        HashMap<String, Long> data=new HashMap<>();
        data.put("goodsId",goods.getGid());
        return new JsonResult<>(200,"上传成功",data);
    }

    @RequestMapping("/update")

    public JsonResult updateGoods(@RequestBody Goods goods) {

        long flag =goodsService.updateGoods(goods);
        return new JsonResult<>(200,"更新成功",flag);
    }
    @RequestMapping("/delete")
    public JsonResult deleteGoods(Long goodsId){
        long flag= goodsService.deleteGoods(goodsId);
        return new JsonResult<>(200, "删除成功", flag);
    }
}
