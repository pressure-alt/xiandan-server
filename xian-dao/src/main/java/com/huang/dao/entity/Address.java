package com.huang.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("address")
public class Address {
    @TableId(type= IdType.AUTO)
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
