package me.erudev.refactor.ch01.v5;

import lombok.Data;

/**
 * 影片
 *
 * @author pengfei.zhao
 * @date 2020/12/12 19:35
 */
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

    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        set_priceCode(_priceCode);
    }

    /**
     * 取得价格代号
     */
    public int get_priceCode() {
        return _price.getPriceCode();
    }

    public String get_title() {
        return _title;
    }

    public void set_priceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDREN:
                _price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrent Price code");
        }
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
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
