package org.Q1;

public class Movie extends Product{

   private String director;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double disAmount = (getPrice() * (50.0 / 100)); //50.0 is percentage amount
        double afterDiscount;
        afterDiscount = getPrice() - disAmount;
        return afterDiscount ; //discount by 50%
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
