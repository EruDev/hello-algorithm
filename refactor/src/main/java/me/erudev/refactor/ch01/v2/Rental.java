package me.erudev.refactor.ch01.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 租赁
 *
 * @author pengfei.zhao
 * @date 2020/12/12 19:40
 */
@AllArgsConstructor
@Getter
public class Rental {
    /**
     * 影片
     */
    private Movie _movie;
    /**
     * 租赁时长
     */
    private int _daysRented;
}
