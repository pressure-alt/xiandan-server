package com.huang.web.controller;

import com.alibaba.fastjson.JSON;
import com.huang.biz.service.GoodsService;
import com.huang.biz.service.UserService;
import com.huang.dao.entity.Goods;
import com.huang.dao.entity.WxUser;
import com.huang.web.JsonResult;
import com.huang.web.vo.GoodsVo;
import com.huang.web.vo.UserVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        for (Goods goods : goodsList) {
            WxUser user = userService.getUserInfo(goods.getOwnerId());
            GoodsVo goodsVo = new GoodsVo();
            UserVo userVo = new UserVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/MM/dd");
            goodsVo.setId(goods.getGid());
            goodsVo.setTitle(goods.getGprofile());
            goodsVo.setImgList(JSON.parseArray(goods.getGiconPath()));
            goodsVo.setAddress(goods.getGlocation());
            goodsVo.setFineness(goods.getFineness());
            goodsVo.setCategoryId(goods.getCategoryId());
            goodsVo.setPrePrice(goods.getGprePrice());
            goodsVo.setStockNum(goods.getStockNum());
            goodsVo.setInfo(goods.getGdetails());
            goodsVo.setPrice(goods.getGprice());
            goodsVo.setUserVo(userVo);
            goodsVos.add(goodsVo);
            String t=simpleDateFormat.format(goods.getTime());
            goodsVo.setTime(t);
            userVo.setUserId(user.getUserId());
            userVo.setAvatarUrl(user.getAvatarUrl());
            userVo.setNickName(user.getNickName());
        }
        return new JsonResult<>(200, "商品列表", goodsVos);
    }
    //上传商品
    @RequestMapping("/upload")
    public JsonResult uploadGoods(@RequestBody Goods goods) {
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
    public List<Goods> searchKw( String keyWords) {
        return goodsService.searchGoodsKey(keyWords);
    }
    //按商品分类查找商品
    @PostMapping("/search-cid")
    public List<Goods> searchCid(Long  categoryId) {
        return goodsService.searchGoodsCategoryId(categoryId);
    }
}