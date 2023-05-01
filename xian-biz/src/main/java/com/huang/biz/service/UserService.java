package com.huang.biz.service;

import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    WxUser getUserInfo(long userId);

    WxUser getUserInfoByOpenId(String openId);
    List<WxUser>getUserInfoList(long[]userId);
    /**
     * 获取用户所有地址信息
     * @param id
     * @return
     */
    List<Address> getUsersAllAddress(long id);

    /**
     * 获取用户默认地址id
     * @param id
     * @return
     */
    Integer getUserDefaultAddressId(long id);

    void addUserAddress(Address address);


}
