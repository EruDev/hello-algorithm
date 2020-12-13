package me.erudev.refactor.ch01.v5;

/**
 * @author pengfei.zhao
 * @date 2020/12/13 0:12
 */
public class ChildrenPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }

}
