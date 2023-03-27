package com.huang.biz.service.impl;

import com.huang.biz.service.GoodsService;
import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> goodList(int page) {

        return goodsMapper.getRandomGoods(page);
    }

    @Override
    public int  insertGoods(Goods goods) {

//        Goods goods=new Goods();
//goods.setCategoryId(categoryId);
//goods.setFineness(fineness);
//goods.setOwnerId(ownerId);
////goods.setGid(0011L);
////        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//注意月和小时的格式为两个大写字母
////        java.util.Date date = new Date();//获得当前时间
////goods.setTime(date);
//goods.setGdetails(details);
//goods.setStockNum(num);
//goods.setGlocation(location);
//goods.setGiconPath("no path here");
//goods.setGprePrice(BigDecimal.valueOf(998.98));
//goods.setGprice(BigDecimal.valueOf(price));
//goods.setGstatus(0);
//goods.setGprofile(profile);
        int flag =goodsMapper.insertGoods(goods);
        return flag;
    }

    @Override
    public int deleteGoods(long goodsId) {
        return goodsMapper.deleteGoodsByGid(goodsId);
    }

    @Override
    public int updateGoods(Goods goods) {
        return 0;
    }


}
