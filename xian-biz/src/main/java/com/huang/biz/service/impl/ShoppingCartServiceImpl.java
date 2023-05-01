package com.huang.biz.service.impl;

import com.huang.biz.service.ShoppingCartService;
import com.huang.dao.entity.ShoppingCart;
import com.huang.dao.mapper.GoodsMapper;
import com.huang.dao.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    ShoppingCartMapper shoppingCartMapper;
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public ShoppingCart selectShoppingCartByUserId(Long userId) {

        return null ;
    }

    @Override
    public List<ShoppingCart> selectShoppingCartList(Long userId) {
        return shoppingCartMapper.selectShoppingCartList(userId);
    }

    @Override
    public int insertShoppingCart(ShoppingCart shoppingcart) {
        return 0;
    }

    @Override
    public int updateShoppingCart(ShoppingCart shoppingcart) {
        return 0;
    }

    @Override
    public int deleteShoppingCartByUserId(Long userId) {
        return 0;
    }

    @Override
    public int deleteShoppingCartByUserIds(String[] userIds) {
        return 0;
    }
}
