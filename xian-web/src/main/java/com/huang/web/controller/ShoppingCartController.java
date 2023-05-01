package com.huang.web.controller;

import com.huang.biz.service.GoodsService;
import com.huang.biz.service.ShoppingCartService;
import com.huang.biz.service.UserService;
import com.huang.dao.entity.Goods;
import com.huang.dao.entity.ShoppingCart;
import com.huang.dao.entity.WxUser;
import com.huang.dao.mapper.ShoppingCartMapper;
import com.huang.web.vo.GoodsVo;
import com.huang.web.vo.ShoppingCartVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public List<GoodsVo> getShoppingCartByOpenId(String openId){
        log.info(openId);
        WxUser userInfo = userService.getUserInfoByOpenId(openId);
        log.info(userInfo.toString());
        List<ShoppingCart> shoppingCarts = shoppingCartService.selectShoppingCartList(userInfo.getUserId());
        log.info(shoppingCarts.toString());
        List<Goods> goodsList= new ArrayList<>();
        List<GoodsVo> goodsVos = new ArrayList<>();
        for (ShoppingCart shoppingCart:shoppingCarts){
            goodsList.add(goodsService.getGoods(shoppingCart.getGid())) ;
        }
        for (Goods goods : goodsList) {
            WxUser user = userService.getUserInfo(goods.getOwnerId());
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.constructGoodsVo(goods,user);
            goodsVos.add(goodsVo);
        }

        return goodsVos;
    }

}
