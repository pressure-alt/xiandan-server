package com.huang.biz.service;

import com.huang.dao.entity.Goods;

import java.util.List;


public interface GoodsService {

    List<Goods> goodList(int param, int pageSize);



    Goods getGoods(Long goodsId);



    int deleteGoods(long goodsId);



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
     * 批量删除商品
     *
     * @param gids 需要删除的商品主键集合
     * @return 结果
     */
    public int deleteGoodsByGids(Long[] gids);

    /**
     * 删除商品信息
     *
     * @param gid 商品主键
     * @return 结果
     */
    public int deleteGoodsByGid(Long gid);
    List<Goods> searchGoodsKey(String keyWords);

    List<Goods> searchGoodsCategoryId(Long categoryId);
}
