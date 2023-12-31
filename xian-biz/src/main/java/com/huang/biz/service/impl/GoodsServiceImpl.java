package com.huang.biz.service.impl;

import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Goods selectGoodsByGid(Long gid) {
        return goodsMapper.selectGoodsByGid(gid);
    }

    @Override
    public List<Goods> selectGoodsList(Goods goods) {
        return goodsMapper.selectGoodsList(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }

    @Override
    public int deleteGoodsByGids(Long[] gids) {
        return goodsMapper.deleteGoodsByGids(gids);
    }

    @Override
    public int deleteGoodsByGid(Long gid) {
        return goodsMapper.deleteGoodsByGid(gid);
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
