package com.huang.biz.service;

import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<WxUser> getUserInfo();
    List<Address>getUsersAllAddress(int id);
    Integer getUserDefaultAddressId(int id);
    void addUserAddress(JSONObject jsonObject);
}
