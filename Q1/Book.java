package org.Q1;

public class Book extends Product{

   private String author;


    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double disAmount = (getPrice() * (15.0 / 100));
        double afterDiscount;
        afterDiscount = getPrice() - disAmount;
        return afterDiscount ; //discount by 15%
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
