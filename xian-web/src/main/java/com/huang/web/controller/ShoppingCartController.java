package com.huang.web.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.huang.biz.service.GoodsService;
import com.huang.biz.service.ShoppingCartService;
import com.huang.biz.service.UserService;
import com.huang.dao.entity.ShoppingCart;
import com.huang.dao.entity.ShoppingCartVo;
import com.huang.dao.entity.WxUser;
import com.huang.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/shopping-cart")
@ComponentScan("com.huang.biz.service.impl")
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    UserService userService;
    @RequestMapping("/info")
    public List<ShoppingCartVo> getShoppingCartByOpenId(String openId){
        log.info(openId);
        WxUser userInfo = userService.getUserInfoByOpenId(openId);
        log.info(userInfo.toString());
        List<ShoppingCartVo> shoppingCarts = shoppingCartService.selectShoppingCartList(userInfo.getUserId());
        return shoppingCarts;
    }
    //添加购物车
    @RequestMapping("/add")
    public JsonResult addCart(@RequestBody ShoppingCart shoppingCart) {


        ShoppingCart one = shoppingCartService.getOne(Wrappers.lambdaQuery(ShoppingCart.class)
                .eq(ShoppingCart::getUserId, shoppingCart.getUserId()).eq(ShoppingCart::getGid, shoppingCart.getGid()));

        if(one!=null){
            ShoppingCart sc = ShoppingCart.builder().num(one.getNum()+1).build();
            shoppingCartService.update(sc,Wrappers.lambdaUpdate(ShoppingCart.class)
                   .eq(ShoppingCart::getUserId, shoppingCart.getUserId()).eq(ShoppingCart::getGid, shoppingCart.getGid()));
        }else{
            shoppingCartService.save(shoppingCart);
        }


        return new JsonResult<>(200, "添加成功");
    }
    @DeleteMapping("/delete")
    public JsonResult deleteCart(@RequestBody ShoppingCart shoppingCart){
        shoppingCartService.remove(Wrappers.lambdaQuery(ShoppingCart.class)
                .eq(ShoppingCart::getUserId, shoppingCart.getUserId()).eq(ShoppingCart::getGid, shoppingCart.getGid()));

        return new JsonResult<>(200,"删除成功");

    }
}
