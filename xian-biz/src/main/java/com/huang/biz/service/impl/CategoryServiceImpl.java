package com.huang.biz.service.impl;

import com.huang.biz.service.CategoryService;
import com.huang.dao.entity.Category;
import com.huang.dao.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> getCategories() {

        return categoryMapper.selectCategoryList();
    }
}
