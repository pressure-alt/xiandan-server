package com.huang.web.controller;

import com.huang.biz.service.CategoryService;
import com.huang.web.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.huang.biz.service.impl")
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/get")
    public JsonResult getCategories(){
        return new JsonResult(200,"商品分类列表",categoryService.getCategories());

    }
}
