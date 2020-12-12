package me.erudev.refactor.ch01.v4;

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

    /**
     * 计算不同影片租赁时长的费用
     *
     * @return 费用
     */
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    /**
     * 计算常客积分
     *
     * @return 积分
     */
    public int getFrequentRentalPoints() {
        return _movie.getFrequentRentalPoints(_daysRented);
    }
}
