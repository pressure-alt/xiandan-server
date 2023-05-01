package com.huang.biz.service.impl;

import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> goodList(int param,int pageSize) {

        return goodsMapper.getRandomGoods(param,pageSize);
    }

    @Override
    public List<Goods> getGoodsList(Long[] goodsIds) {
        return null;
    }

    @Override
    public Goods getGoods(Long goodsId) {
        return goodsMapper.selectGoodsByGid(goodsId);
    }

    @Override
    public int  insertGoods(Goods goods) {


        int flag =goodsMapper.insertGoods(goods);

        return flag;
    }

    @Override
    public int deleteGoods(long goodsId) {
        return goodsMapper.deleteGoodsByGid(goodsId);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }

    @Override
    public List<Goods> searchGoodsKey(String keyWords) {
        return  goodsMapper.selectGoodsWithKeyWd(keyWords);

    }

    @Override
    public List<Goods> searchGoodsCategoryId(Long categoryId) {
        return goodsMapper.selectGoodsWithCategoryId(categoryId);
    }


}
