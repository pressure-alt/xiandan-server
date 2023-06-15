package com.huang.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.biz.service.ShoppingCartService;
import com.huang.dao.entity.ShoppingCart;
import com.huang.dao.entity.ShoppingCartVo;
import com.huang.dao.mapper.GoodsMapper;
import com.huang.dao.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper,ShoppingCart> implements ShoppingCartService {
    @Resource
    ShoppingCartMapper shoppingCartMapper;
    @Resource
    GoodsMapper goodsMapper;

    @Override
    public ShoppingCart selectShoppingCartByUserId(Long userId) {

        return null ;
    }

    @Override
    public List<ShoppingCartVo> selectShoppingCartList(Long userId) {
        return shoppingCartMapper.selectShoppingCartList(userId);
    }

    @Override
    public int insertShoppingCart(ShoppingCart shoppingcart) {


        return shoppingCartMapper.insertShoppingCart(shoppingcart);
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
