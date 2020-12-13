package me.erudev.refactor.ch01.v5;

/**
 * @author pengfei.zhao
 * @date 2020/12/13 0:12
 */
public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        double result = 0;
        result += daysRented * 3;

        return result;
    }
}
