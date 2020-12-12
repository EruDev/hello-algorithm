package me.erudev.refactor.ch01.v2;

import lombok.Getter;


import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 *
 * @author pengfei.zhao
 * @date 2020/12/12 19:42
 */
@Getter
public class Customer {
    /**
     * 姓名
     */
    private String _name;
    /**
     * 租赁影片信息
     */
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg) {
        this._rentals.add(arg);
    }

    /**
     * 生成详单
     * @return 结果
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRentalPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental record for" + get_name() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental rental = rentals.nextElement();
            thisAmount = amountFor(rental);
            frequentRentalPoints++;
            if ((rental.get_movie().get_priceCode() == Movie.NEW_RELEASE) && rental.get_daysRented() > 1) {
                frequentRentalPoints++;
            }
            result += "\t" + rental.get_movie().get_title() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + totalAmount + "\n";
        result += "Your earned " + frequentRentalPoints + " frequent renter points";
        return result;
    }

    public double amountFor(Rental rental) {
        double result = 0;
        switch (rental.get_movie().get_priceCode()) {
            case Movie.CHILDREN:
                result += 2;
                if (rental.get_daysRented() > 2) {
                    result += (rental.get_daysRented() - 2) * 1.6;
                }
                break;
            case Movie.NEW_RELEASE:
                result += rental.get_daysRented() * 3;
                break;
            case Movie.REGULAR:
                result += 1.5;
                if (rental.get_daysRented() > 3) {
                    result += (rental.get_daysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
