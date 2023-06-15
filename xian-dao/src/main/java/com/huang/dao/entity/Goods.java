package com.huang.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("goods")
public class Goods {
    @TableId(type= IdType.AUTO)
    /** 商品id */
    private Long gid;

    /** 商品简介 */
    private String gprofile;

    /** 商品价格 */
    private BigDecimal gprice;

    /** 商品原价 */
    private BigDecimal gprePrice;

    /** 商品图片存储路径 */
    private String giconPath;

    /** 商品详情 */
    private String gdetails;

    /** 卖家id */
    private Long ownerId;

    /** 位置 */
    private String glocation;

    /** 商品成色 */
    private String fineness;

    /** 商品库存 */
    private Long stockNum;

    /** 商品分类id */
    private Long categoryId;

    /** 商品是否上架(0未上架 1已上架) */
    private Integer gstatus;

    /** 发布时间 */
    private java.util.Date time;




}
