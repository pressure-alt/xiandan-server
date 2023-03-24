package com.huang.dao.mapper;

import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WxUserMapper {
    List<WxUser> getUserInfo();
    Integer getUsersDefaultAddressId(@Param("user_id")int id);
    List<Address> getUsersAllAddress(@Param("user_id")int id);
}
