package com.huang.dao.mapper;

import com.huang.dao.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huangss
 */
@Mapper
public interface AddressMapper {
    /**
     * @param userId
     * @return
     */
    List<Address>getAllAddressByUserId(@Param("userId")int userId);
    /**
     * 查询地址
     *
     * @param addressId 地址主键
     * @return 地址
     */
    public Address selectAddressByAddressId(Long addressId);

    /**
     * 查询地址列表
     *
     * @param address 地址
     * @return 地址集合
     */
    public List<Address> selectAddressList(Address address);

    /**
     * 新增地址
     *
     * @param address 地址
     * @return 结果
     */
    public int insertAddress(Address address);

    /**
     * 修改地址
     *
     * @param address 地址
     * @return 结果
     */
    public int updateAddress(Address address);

    /**
     * 删除地址
     *
     * @param addressId 地址主键
     * @return 结果
     */
    public int deleteAddressByAddressId(Long addressId);

    /**
     * 批量删除地址
     *
     * @param addressIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAddressByAddressIds(String[] addressIds);
}

