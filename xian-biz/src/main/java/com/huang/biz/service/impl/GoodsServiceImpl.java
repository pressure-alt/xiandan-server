package com.huang.biz.service.impl;

import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> goodList(int page) {

        log.info("sssb");
        return goodsMapper.getRandomGoods(page);
    }

    @Override
    public boolean insertGoods() {
        return false;
    }

    @Override
    public boolean insertGoods(String profile, double price, int categoryId, String location, String details, String iconPath, int id, int num, String fineness) {

            goodsMapper.insertGoods(profile,price,categoryId,location,details,iconPath,id,num,fineness);



        return true;
    }
}
