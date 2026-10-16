package day22.kodewala.practise;

import java.util.Scanner;

//1. Food class
class Food {
 String name;
 double price;

 Food(String name, double price) {
     this.name = name;
     this.price = price;
 }

 void displayFood() {
     System.out.println(name + " - ₹" + price);
 }
}


