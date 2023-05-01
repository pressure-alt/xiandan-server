package com.huang.web.controller;


import com.huang.biz.service.GoodsService;
import com.huang.biz.service.UserService;
import com.huang.dao.entity.Goods;
import com.huang.dao.entity.WxUser;
import com.huang.web.JsonResult;
import com.huang.web.vo.GoodsVo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Slf4j
@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("/goods")
public class GoodsController {
    //使用注解注入service
    @Autowired
    GoodsService goodsService;
    @Autowired
    UserService userService;
    @Value("${xiandan.resources.page.pageSize}")
    private int pageSize;
    //获取商品列表
    @RequestMapping("/list")
    public JsonResult goodsList(Integer page) {
        int param = page * pageSize;
        List<Goods> goodsList = goodsService.goodList(param, pageSize);
        List<GoodsVo> goodsVos = new ArrayList<>();
        //将商品信息和卖家信息封装
        for (Goods goods : goodsList) {
            WxUser user = userService.getUserInfo(goods.getOwnerId());
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.constructGoodsVo(goods,user);
            goodsVos.add(goodsVo);
        }
        return new JsonResult<>(200, "商品列表", goodsVos);
    }
    //上传商品
    @RequestMapping("/upload")
    public JsonResult uploadGoods(@RequestBody Goods goods) {
        log.info(goods.toString());
        long goodsId = goodsService.insertGoods(goods);
        HashMap<String, Long> data = new HashMap<>();

        data.put("goodsId", goods.getGid());
        return new JsonResult<>(200, "上传成功", data);
    }
    //更新商品
    @RequestMapping("/update")
    public JsonResult updateGoods(@RequestBody Goods goods) {
        long flag = goodsService.updateGoods(goods);
        return new JsonResult<>(200, "更新成功", flag);
    }
    @RequestMapping("/delete")
    public JsonResult deleteGoods(Long goodsId) {
        long flag = goodsService.deleteGoods(goodsId);
        return new JsonResult<>(200, "删除成功", flag);
    }
    //上架商品
    @RequestMapping("/display-on")
    public JsonResult displayOn(Long goodsId, Long userId) {
        Goods goods = new Goods();
        goods.setGid(goodsId);
        goods.setOwnerId(userId);
        goods.setGstatus(1);
        int flag = goodsService.updateGoods(goods);
        if (flag == 1) {
            return new JsonResult<>(200, "更新成功");
        }
        return new JsonResult<>(500, "更新失败");
    }
    //下架商品
    @RequestMapping("/display-off")
    public JsonResult displayOff( Long goodsId, Long userId) {
        Goods goods = new Goods();
        goods.setGid(goodsId);
        goods.setOwnerId(userId);
        goods.setGstatus(0);
        int flag = goodsService.updateGoods(goods);
        if (flag == 1) {
            return new JsonResult<>(200, "下架成功");
        }
        return new JsonResult<>(500, "下架失败");
    }
    //按商品关键字查找商品
    @PostMapping("/search-words")
    public JsonResult searchKw( String keyWords) {
        List<Goods> goodsList = goodsService.searchGoodsKey(keyWords);
        List<GoodsVo> goodsVos=new ArrayList<>();
        for (Goods goods : goodsList) {
            WxUser user = userService.getUserInfo(goods.getOwnerId());
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.constructGoodsVo(goods,user);
            goodsVos.add(goodsVo);
        }
        return  new JsonResult<>(200, "商品列表", goodsVos);
    }
    //按商品分类查找商品
    @PostMapping("/search-cid")
    public JsonResult searchCid(Long  categoryId) {
        List<Goods> goodsList = goodsService.searchGoodsCategoryId(categoryId);
        List<GoodsVo> goodsVos=new ArrayList<>();
        for (Goods goods : goodsList) {
            WxUser user = userService.getUserInfo(goods.getOwnerId());
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.constructGoodsVo(goods,user);
            goodsVos.add(goodsVo);
        }
        return  new JsonResult<>(200, "商品列表", goodsVos);
    }
}