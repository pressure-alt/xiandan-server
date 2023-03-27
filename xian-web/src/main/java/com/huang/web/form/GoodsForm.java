package com.huang.web.form;

import lombok.Data;

@Data
public class GoodsForm {
    private String profile;
    private String details;
    private double price;
    private long categoryId;

    private String fineness;
    private long num;
    private String location;
    private long userId;
}
