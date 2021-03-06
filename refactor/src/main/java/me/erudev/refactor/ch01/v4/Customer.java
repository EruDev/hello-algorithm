package me.erudev.refactor.ch01.v4;

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
     *
     * @return 结果
     */
    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental record for" + get_name() + "\n";
        while (rentals.hasMoreElements()) {
            Rental rental = rentals.nextElement();
            result += "\t" + rental.get_movie().get_title() + "\t" + rental.getCharge() + "\n";
        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "Your earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental rental = rentals.nextElement();
            result += rental.getFrequentRentalPoints();
        }
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental rental = rentals.nextElement();
            result += rental.getCharge();
        }
        return result;
    }

}
