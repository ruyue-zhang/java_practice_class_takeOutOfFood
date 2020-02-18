package com.thoughtworks;

import java.util.ArrayList;

public class NoDiscount implements Discount {
    private ArrayList<SelectedDish> selectedDishes;

    public NoDiscount(ArrayList<SelectedDish> selectedDishes) {
        this.selectedDishes = selectedDishes;
    }

    @Override
    public double getDiscountedPrice() {
        double totalPrice = 0;
        for (SelectedDish selectedDish : selectedDishes) {
            totalPrice += selectedDish.getPrice() * selectedDish.getCount();
        }
        return totalPrice;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
