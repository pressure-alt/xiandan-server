package com.huang.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("category")
public class Category {
    @TableId(type= IdType.AUTO)
    /** 分类id */
    private Long categoryId;

    /** 分类名称 */
    private String categoryName;

    /** 父分类id */
    private Integer categoryParentId;

    /** 图片路径 */
    private String imagePath;
}
