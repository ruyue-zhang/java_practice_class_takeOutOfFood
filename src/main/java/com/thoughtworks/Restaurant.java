package com.thoughtworks;

import java.util.ArrayList;

public class Restaurant {

  public String bestCharge(String selectedItems) {
    ParsingUserInput parsingUserInput = new ParsingUserInput(selectedItems);
    ArrayList<SelectedDish> selectedDishes = parsingUserInput.getSelectedDishList();
    System.out.println(chooseDiscountWay(selectedDishes).getReceipt());
    return chooseDiscountWay(selectedDishes).getReceipt();
  }


  private Render chooseDiscountWay(ArrayList<SelectedDish> selectedDishes) {
    Discount noDiscount = new NoDiscount(selectedDishes);
    double totalPrice = noDiscount.getDiscountedPrice();
    Discount halfPrice = new HalfPrice(totalPrice, selectedDishes);
    double halfPriceTotal = halfPrice.getDiscountedPrice();
    Discount overDec = new OverDec(totalPrice);
    double overDecTotal = overDec.getDiscountedPrice();

    Render render;
    if(halfPriceTotal > overDecTotal) {
      render = new Render(selectedDishes, overDecTotal, overDec.getDescription());
    } else {
      if(halfPriceTotal == totalPrice) {
        render = new Render(selectedDishes, totalPrice, noDiscount.getDescription());
      } else {
        render = new Render(selectedDishes, halfPriceTotal, halfPrice.getDescription());
      }
    }
    return render;
  }
}
