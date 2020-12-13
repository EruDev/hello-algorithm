package me.erudev.refactor.ch01.v5;

/**
 * @author pengfei.zhao
 * @date 2020/12/13 0:11
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
