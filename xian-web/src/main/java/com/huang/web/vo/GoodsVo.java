package com.huang.web.vo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.huang.dao.entity.Goods;
import com.huang.dao.entity.WxUser;
import lombok.Data;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
@Data
public class GoodsVo {
    /** 商品id */
    private Long id;

    /** 商品简介 */
    private String title;

    /** 商品价格 */
    private BigDecimal price;

    /** 商品原价 */
    private BigDecimal prePrice;

    /** 商品图片存储路径 */
    private JSONArray imgList;

    /** 商品详情 */
    private String info;

    /** 卖家id */
    private Long ownerId;

    /** 位置 */
    private String address;

    /** 商品成色 */
    private String fineness;

    /** 商品库存 */
    private Long stockNum;

    /** 商品分类id */
    private Long categoryId;

    /** 发布时间 */
    private String time;

    private UserVo userVo;

//    public void constructGoodsVo(Goods goods, WxUser user){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/MM/dd");
//
//        this.setId(goods.getGid());
//        this.setTitle(goods.getGprofile());
//        this.setImgList(JSON.parseArray(goods.getGiconPath()));
//        this.setAddress(goods.getGlocation());
//        this.setFineness(goods.getFineness());
//        this.setCategoryId(goods.getCategoryId());
//        this.setPrePrice(goods.getGprePrice());
//        this.setStockNum(goods.getStockNum());
//        this.setInfo(goods.getGdetails());
//        this.setPrice(goods.getGprice());
//        String t=simpleDateFormat.format(goods.getTime());
//        this.setTime(t);
//        this.userVo.setUserId(user.getUserId());
//        this.userVo.setAvatarUrl(user.getAvatarUrl());
//        this.userVo.setNickName(user.getNickName());
//    }
}
