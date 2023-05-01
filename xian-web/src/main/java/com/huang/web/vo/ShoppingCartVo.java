package com.huang.web.vo;

import com.alibaba.fastjson.JSONArray;
import com.huang.dao.entity.Goods;
import lombok.Data;

import java.math.BigDecimal;
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
    private JSONArray imgList;

    /** 商品库存 */
    private Long stockNum;

    /** 加购商品数量*/
    private Long quantity;

}
