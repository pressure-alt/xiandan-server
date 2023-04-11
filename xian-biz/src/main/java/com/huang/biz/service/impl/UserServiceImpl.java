package com.huang.biz.service.impl;

import com.huang.biz.service.UserService;
import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import com.huang.dao.mapper.AddressMapper;
import com.huang.dao.mapper.WxUserMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private WxUserMapper wxUserMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public WxUser getUserInfo(long userId) {
        return wxUserMapper.getUserInfo( userId);
    }

    @Override
    public List<WxUser> getUserInfoList(long[] userId) {

        return wxUserMapper.getUserInfoList(userId);
    }

    @Override
    public List<Address> getUsersAllAddress(long id) {
        return wxUserMapper.getUsersAllAddress(id);
    }

    @Override
    public Integer getUserDefaultAddressId(long id) {
        return wxUserMapper.getUsersDefaultAddressId(id);
    }

    @Override
    public void addUserAddress(Address address) {
        addressMapper.insertAddress(address);
    }
}
