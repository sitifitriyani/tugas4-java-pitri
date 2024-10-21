package com.tugas4.pitri.models;

public class ChefRestaurant {
  private Food food;
  private Chef chef; 

   public ChefRestaurant(Food food,Chef chef){
    this.food=food;
    this.chef=chef;
   }


public Food getFood() {
    return food;
}

public Chef getChef() {
    return chef;
}



}
