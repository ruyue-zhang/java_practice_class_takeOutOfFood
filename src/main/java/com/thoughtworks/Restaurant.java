package com.thoughtworks;

import java.util.ArrayList;

public class Restaurant {

  public String bestCharge(String selectedItems) {
    ParsingUserInput parsingUserInput = new ParsingUserInput(selectedItems);
    ArrayList<SelectedDish> selectedDishes = parsingUserInput.getSelectedDishList();
    return null;
  }
}
