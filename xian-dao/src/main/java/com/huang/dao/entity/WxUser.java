package com.huang.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class WxUser {
    @TableId(type=IdType.AUTO)
    /** 用户id */
    private Long userId;

    /** 微信openid(唯一标示) */
    private String openId;

    /** 微信昵称 */
    private String nickName;

    /** 微信头像 */
    private String avatarUrl;

    /** 性别 */
    private String gender;

    /** 国家 */
    private String country;

    /** 省份 */
    private String province;

    /** 城市 */
    private String city;

    /** 默认收货地址 */
    private String addressId;

}
