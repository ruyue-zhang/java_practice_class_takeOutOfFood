package com.thoughtworks;

public class SelectedDish {
    private String id;
    private String name;
    private double price;
    private int count;

    public SelectedDish(String id, int count) {
        this.id = id;
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }


}
