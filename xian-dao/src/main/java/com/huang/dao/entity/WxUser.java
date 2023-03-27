package com.huang.dao.entity;

import jdk.jfr.Unsigned;
import lombok.Data;

@Data
public class WxUser {

    /** 用户id */
    private String userId;

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
