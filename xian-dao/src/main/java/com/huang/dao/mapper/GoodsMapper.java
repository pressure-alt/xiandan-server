package com.huang.dao.mapper;

import com.huang.dao.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods>getRandomGoods(@Param("page")int page);
    boolean insertGoods(@Param("profile")String profile,
                        @Param("price")double price,
                        @Param("category_id")int categoryId,
                        @Param("location")String location,
                        @Param("details")String details,
                        @Param("icon_Path")String iconPath,
                        @Param("owner_id")int id,
                        @Param("stock_num") int num,
                        @Param("fineness")String fineness
                        );
}
