package com.huang.dao.mapper;

import com.huang.dao.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods>getRandomGoods(@Param("page")int page);
//    boolean insertGoods(@Param("profile")String profile,
//                        @Param("price")double price,
//                        @Param("category_id")long categoryId,
//                        @Param("location")String location,
//                        @Param("details")String details,
//                        @Param("owner_id")  long id,
//                        @Param("stock_num") long num,
//                        @Param("fineness")String fineness
//                        );
//    boolean insertGood(Goods goods);
    /**
     * 查询商品
     *
     * @param gid 商品主键
     * @return 商品
     */
    public Goods selectGoodsByGid(Long gid);

    /**
     * 查询商品列表
     *
     * @param goods 商品
     * @return 商品集合
     */
    public List<Goods> selectGoodsList(Goods goods);

    /**
     * 新增商品
     *
     * @param goods 商品
     * @return 结果
     */
    public int insertGoods(Goods goods);

    /**
     * 修改商品
     *
     * @param goods 商品
     * @return 结果
     */
    public int updateGoods(Goods goods);

    /**
     * 删除商品
     *
     * @param gid 商品主键
     * @return 结果
     */
    public int deleteGoodsByGid(@Param("goodsId") Long gid);

    /**
     * 批量删除商品
     *
     * @param gids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGoodsByGids(String[] gids);
}
