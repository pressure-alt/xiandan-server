package com.huang.biz.service;

import com.huang.dao.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsService {

    List<Goods>goodList(int page);
    boolean insertGoods();

    boolean insertGoods(String profile, double price, int categoryId, String location, String details, String iconPath, int id, int num, String fineness);
}
