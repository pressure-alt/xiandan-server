package com.huang.web.controller;

import com.huang.biz.service.UserService;
import com.huang.biz.service.impl.UserServiceImpl;
import com.huang.dao.entity.Address;
import com.huang.dao.entity.WxUser;
import com.huang.biz.service.DemoService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@ComponentScan("com.huang.biz.service.impl")
public class UserController {
    @Resource
    private DemoService demoService;

    @GetMapping("/test")
    public List<WxUser> test() {
        return demoService.sayHi();
    }

    @Resource
    private UserService userService;
    @ResponseBody
    @PostMapping("/address")
    public List<Address> addressList(@RequestParam ("userId")Integer userId, HttpServletRequest request) {
//    public List<Address> addressList(@RequestBody Map<String,Object> json, HttpServletRequest request) {
        System.out.println("\\\\");
//        System.out.println(json);
//        System.out.println(json.get("userId") instanceof Integer);
        return userService.getUsersAllAddress(userId);
    }


}
