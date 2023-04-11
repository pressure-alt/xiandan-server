package com.huang.web.vo;

import lombok.Data;

@Data
public class UserVo {
    /**
     * 用户id
     */
    private long userId;
    /**
     * 微信昵称
     */
    private String nickName;

    /**
     * 微信头像
     */
    private String avatarUrl;
    /**
     * 微信号
     */
    private String vx;
}
