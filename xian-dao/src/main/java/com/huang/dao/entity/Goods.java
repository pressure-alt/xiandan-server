package com.huang.dao.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Goods {
    public long gid;    //			商品id
    public String profile;    //商品简介
    public double price;//	商品价格
    public double prePrice;    //商品原价
    public int categoryId;//商品分类
    public String details;//商品详情
    public int ownerId;//卖家id
    public int stockNum;//库存数量
    public String iconPath;//商品图片存储路径
    public int status;    //商品是否上架(0未上架 1已上架)
    public Date time; //上架时间
    public String location;//商品所在地
    public String fineness;//商品成色

}
