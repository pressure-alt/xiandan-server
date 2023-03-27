package com.huang.dao;

import com.huang.dao.entity.Goods;
import com.huang.dao.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest(classes = {
        GoodsMapper.class,
        DataSourceAutoConfiguration.class,
        SqlSessionFactory.class
})
@MapperScan("com.huang.dao.mapper")
public class test {
    @Autowired
GoodsMapper goodsMapper;
    @Test
    public void testDAO(){
//        Goods goods=new Goods();
//        goods.setCategoryId(1);
//        goods.setDetails("123");
//        goods.setFineness("98");
//        goods.setLocation("zheli");
//        goods.setOwnerId(123);
//        goods.setIconPath("111/222");
//        goods.setPrice(123.222);
//        goods.setStockNum(99);
//        boolean falg1=goodsMapper.insertGoods("1",2.22,3,"地址","详情",223,12,"九五新");
//       boolean falg2= goodsMapper.insertGood(goods);
//        log.info("{}\n{}",falg1,falg2);

    }
}
