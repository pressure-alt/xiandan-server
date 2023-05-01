package com.huang.biz.service;

import com.huang.dao.entity.Goods;

import java.util.List;


public interface GoodsService {

    List<Goods> goodList(int param, int pageSize);

    List<Goods> getGoodsList(Long[] goodsIds);

    Goods getGoods(Long goodsId);

    int insertGoods(Goods goods);

    int deleteGoods(long goodsId);

    int updateGoods(Goods goods);

    List<Goods> searchGoodsKey(String keyWords);

    List<Goods> searchGoodsCategoryId(Long categoryId);
}
