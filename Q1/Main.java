package org.Q1;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Alice in Wonderland", 100.0, "Lewis Carrol");
        Book book2 = new Book("Animal Farm", 80.0, "George Orwell");

        Movie movie1 = new Movie("Titanic", 140000.0, " James Cameron");
        Movie movie2 = new Movie("Forrest Gump", 20000.0, "Robert Zemeckis");


        System.out.println("** Book.1 Information **");
        System.out.println("Book name: " + book1.getName());
        System.out.println("Book original price: " + book1.getPrice() + " SR");
        System.out.println("Book author: " + book1.getAuthor());
        System.out.println("Book price after discount by 15%: " + book1.getDiscount() + " SR" + "\n");

        System.out.println("** Book.2 Information **");
        System.out.println("Book name: " + book2.getName());
        System.out.println("Book original price: " + book2.getPrice() + " SR");
        System.out.println("Book author: " + book2.getAuthor());
        System.out.println("Book price after discount by 15%: " + book2.getDiscount() + " SR");

        System.out.println("----------------------------");

        System.out.println("** Movie.1 Information **");
        System.out.println("Movie name: " + movie1.getName());
        System.out.println("Movie original price: " + movie1.getPrice() + " SR");
        System.out.println("Movie author: " + movie1.getDirector());
        System.out.println("Movie price after discount by 50%: " + movie1.getDiscount() + " SR" + "\n");


        System.out.println("** Movie.2 Information **");
        System.out.println("Movie name: " + movie2.getName());
        System.out.println("Movie original price: " + movie2.getPrice() + " SR");
        System.out.println("Movie author: " + movie2.getDirector());
        System.out.println("Movie price after discount by 50%: " + movie2.getDiscount() + " SR" + "\n");










    }
}