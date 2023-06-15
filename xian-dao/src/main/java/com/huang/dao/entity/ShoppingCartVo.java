package com.huang.dao.entity;

import com.huang.dao.entity.Goods;
import com.huang.dao.entity.WxUser;
import lombok.Data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
@Data
public class ShoppingCartVo {
    /** 商品id */
    private Long id;

    /** 商品简介 */
    private String title;

    /** 商品价格 */
    private BigDecimal price;

    /** 商品图片存储路径 */
    private String imgList;

    /** 商品库存 */
    private Long stockNum;


    private Long quantity;


}

