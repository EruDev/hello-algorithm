package me.erudev.refactor.ch01.v3;

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
        double result = 0;
        switch (get_movie().get_priceCode()) {
            case Movie.CHILDREN:
                result += 2;
                if (get_daysRented() > 2) {
                    result += (get_daysRented() - 2) * 1.6;
                }
                break;
            case Movie.NEW_RELEASE:
                result += get_daysRented() * 3;
                break;
            case Movie.REGULAR:
                result += 1.5;
                if (get_daysRented() > 3) {
                    result += (get_daysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    /**
     * 计算常客积分
     *
     * @return 积分
     */
    public int getFrequentRentalPoints() {
        if ((get_movie().get_priceCode() == Movie.NEW_RELEASE)
                && get_daysRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
