package com.huang.biz.service;

import com.huang.dao.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsService {

    List<Goods> goodList(int page);

    int insertGoods(Goods goods);

    int deleteGoods(long goodsId);

    int updateGoods(Goods goods);
}
