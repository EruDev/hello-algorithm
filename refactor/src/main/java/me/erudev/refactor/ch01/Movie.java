package me.erudev.refactor.ch01;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 影片
 *
 * @author pengfei.zhao
 * @date 2020/12/12 19:35
 */
@AllArgsConstructor
@Data
public class Movie {

    /**
     * 影片类型: 2->儿童片
     */
    public static final int CHILDREN = 2;
    /**
     * 影片类型: 0->普通片
     */
    public static final int REGULAR = 0;
    /**
     * 影片类型: 1->新片
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 影片名称
     */
    private String _title;

    /**
     * 费用
     */
    private int _priceCode;
}
