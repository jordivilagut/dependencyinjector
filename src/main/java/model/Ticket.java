package model;

public class Ticket {

    private String id;
    private double price;


    public Ticket(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
