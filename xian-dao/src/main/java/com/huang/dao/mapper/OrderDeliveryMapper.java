package com.huang.dao.mapper;

import com.huang.dao.entity.OrderDeliveryDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDeliveryMapper {
    /**
     * 查询商品物流信息
     *
     * @param orderId 商品物流信息主键
     * @return 商品物流信息
     */
//    public OrderDeliveryDetail selectOrderDeliveryDetailByOrderId(Long orderId);

    /**
     * 查询商品物流信息列表
     *
     * @param orderDeliveryDetails 商品物流信息
     * @return 商品物流信息集合
     */
    public List<OrderDeliveryDetail> selectOrderDeliveryDetailList(OrderDeliveryDetail orderDeliveryDetails);

    /**
     * 新增商品物流信息
     *
     * @param orderDeliveryDetails 商品物流信息
     * @return 结果
     */
    public int insertOrderDeliveryDetail(OrderDeliveryDetail orderDeliveryDetails);

    /**
     * 修改商品物流信息
     *
     * @param orderDeliveryDetails 商品物流信息
     * @return 结果
     */
    public int updateOrderDeliveryDetail(OrderDeliveryDetail orderDeliveryDetails);

    /**
     * 删除商品物流信息
     *
     * @param orderId 商品物流信息主键
     * @return 结果
     */
    public int deleteOrderDeliveryDetailByOrderId(Long orderId);

    /**
     * 批量删除商品物流信息
     *
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderDeliveryDetailByOrderIds(String[] orderIds);
}
