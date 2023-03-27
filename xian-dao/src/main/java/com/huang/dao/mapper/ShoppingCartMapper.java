package com.huang.dao.mapper;

import com.huang.dao.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShoppingCartMapper {
    /**
     * 查询购物车
     *
     * @param userId 购物车主键
     * @return 购物车
     */
    public ShoppingCart selectShoppingCartByUserId(@Param("userId") Long userId);

    /**
     * 查询购物车列表
     *
     * @param shoppingcart 购物车
     * @return 购物车集合
     */
    public List<ShoppingCart> selectShoppingCartList(ShoppingCart shoppingcart);

    /**
     * 新增购物车
     *
     * @param shoppingcart 购物车
     * @return 结果
     */
    public int insertShoppingCart(ShoppingCart shoppingcart);

    /**
     * 修改购物车
     *
     * @param shoppingcart 购物车
     * @return 结果
     */
    public int updateShoppingCart(ShoppingCart shoppingcart);

    /**
     * 删除购物车
     *
     * @param userId 购物车主键
     * @return 结果
     */
    public int deleteShoppingCartByUserId(Long userId);

    /**
     * 批量删除购物车
     *
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShoppingCartByUserIds(String[] userIds);
}
