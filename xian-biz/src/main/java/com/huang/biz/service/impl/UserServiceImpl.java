package com.huang.biz.service.impl;

import com.huang.biz.service.UserService;
import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import com.huang.dao.mapper.AddressMapper;
import com.huang.dao.mapper.WxUserMapper;
import jakarta.annotation.Resource;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
   private WxUserMapper wxUserMapper;
    @Resource
    private AddressMapper addressMapper;
    @Override
    public List<WxUser> getUserInfo() {
        return wxUserMapper.getUserInfo();
    }

    @Override
    public List<Address> getUsersAllAddress(int id) {
        return wxUserMapper.getUsersAllAddress(id);
    }

    @Override
    public Integer getUserDefaultAddressId(int id) {
        return wxUserMapper.getUsersDefaultAddressId(id);
    }

    @Override
    public void addUserAddress(JSONObject jsonObject) {

    }
}
