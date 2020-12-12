package me.erudev.refactor.ch01.v2;


import org.junit.Test;

/**
 * @author pengfei.zhao
 * @date 2020/12/12 20:22
 */
public class CustomerTest {
    @Test
    public void statementTest() {
        Customer customer = new Customer("John");
        String title = "Titanic";
        int priceCode = 2;
        int _daysRented = 7;
        Movie movie = new Movie(title, priceCode);
        Rental rental = new Rental(movie, _daysRented);
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }

}