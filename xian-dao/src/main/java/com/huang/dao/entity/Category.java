package com.huang.dao.entity;

import lombok.Data;

@Data
public class Category {

    /** 分类id */
    private Long categoryId;

    /** 分类名称 */
    private String categoryName;

    /** 父分类id */
    private Integer categoryParentId;

    /** 图片路径 */
    private String imagePath;
}
