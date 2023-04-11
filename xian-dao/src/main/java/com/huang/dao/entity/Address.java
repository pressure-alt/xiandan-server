package com.huang.dao.entity;

import lombok.Data;

@Data
public class Address {
    /** 地址id */
    private Long addressId;

    /** 用户id */
    private Long userId;

    /** 省份 */
    private String province;

    /** 城市 */
    private String city;

    /** 县(区） */
    private String district;

    /** 详细位置(街道门牌号） */
    private String street;

    /** 收货人姓名 */
    private String name;

    /** 联系人电话 */
    private Long tel;
}
