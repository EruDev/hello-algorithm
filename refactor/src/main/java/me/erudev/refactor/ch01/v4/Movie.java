package me.erudev.refactor.ch01.v4;

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

    public double getCharge(int daysRented) {
        double result = 0;
        switch (get_priceCode()) {
            case Movie.CHILDREN:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.6;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.REGULAR:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRentalPoints(int daysRented) {
        if ((get_priceCode() == Movie.NEW_RELEASE)
                && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
