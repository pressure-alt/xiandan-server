package com.huang.dao.entity;

import jdk.jfr.Unsigned;
import lombok.Data;

@Data
public class WxUser {

    public int userId;
    public String openName;
    public String nickname;
    public String avatarUrl;
    public int addressId;

}
