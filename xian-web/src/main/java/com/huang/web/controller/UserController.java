package com.huang.web.controller;

import com.huang.biz.service.UserService;
import com.huang.dao.entity.Address;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@ComponentScan("com.huang.biz.service.impl")
public class UserController {



    @Resource
    private UserService userService;
    @PostMapping("/address")
    @ResponseBody
    public List<Address> addressList(@RequestBody Integer userId) {
//    public List<Address> addressList(@RequestBody Map<String,Object> json, HttpServletRequest request) {
        System.out.println(userId);

        return userService.getUsersAllAddress(userId);
    }


}
