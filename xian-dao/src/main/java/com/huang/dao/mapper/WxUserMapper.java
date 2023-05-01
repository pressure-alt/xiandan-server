package com.huang.dao.mapper;

import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WxUserMapper {
    WxUser getUserInfo(@Param("userId")long userId);
    WxUser getUserInfoListByOpenId(String openId);
    List<WxUser> getUserInfoList(long[] userIds);
    Integer getUsersDefaultAddressId(@Param("userId")long id);
    List<Address> getUsersAllAddress(@Param("userId")long id);
}
