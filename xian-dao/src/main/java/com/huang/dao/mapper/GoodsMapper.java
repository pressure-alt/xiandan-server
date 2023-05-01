package com.huang.dao.mapper;

import com.huang.dao.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.List;

@Mapper
public interface GoodsMapper {

    /**
     * 推荐商品
     * @param param
     * @return
     */
    List<Goods>getRandomGoods(int param,int pageSize);

    List<Goods>selectGoodsByOwnerId(long ownerId);
    /**
     * 查询商品
     *
     * @param gid 商品主键
     * @return 商品
     */
    List<Goods>  selectGoodsListByGids(Long gid);
    public Goods selectGoodsByGid(Long gid);
    List<Goods> selectGoodsWithKeyWd(String keyWords);
    List<Goods> selectGoodsWithCategoryId(Long categoryId);
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

    int updateGoodsImages(long gid,String ImgURI);
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
