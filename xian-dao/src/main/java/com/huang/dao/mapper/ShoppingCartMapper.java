package com.huang.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huang.dao.entity.ShoppingCart;
import com.huang.dao.entity.ShoppingCartVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

    /**
     * 查询购物车列表
     *
     * @param userId 用户id
     * @return 购物车集合
     */
    public List<ShoppingCartVo> selectShoppingCartList(@Param("userId") Long userId);

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


}
