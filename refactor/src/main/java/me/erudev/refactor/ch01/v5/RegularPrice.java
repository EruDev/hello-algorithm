package me.erudev.refactor.ch01.v5;

/**
 * @author pengfei.zhao
 * @date 2020/12/13 0:12
 */
public class RegularPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented){
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
