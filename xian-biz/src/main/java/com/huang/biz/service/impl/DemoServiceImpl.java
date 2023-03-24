package com.huang.biz.service.impl;

import com.huang.dao.entity.WxUser;
import com.huang.dao.mapper.WxUserMapper;
import com.huang.biz.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Resource

    private WxUserMapper UserMapper;
    @Override
    public List<WxUser> sayHi() {
        return UserMapper.getUserInfo();
    }
}
