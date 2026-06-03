package day3;

import java.util.Scanner;

public class Cashier {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items");
        int quantity = sc.nextInt(); // if quantity=5
        double totalPrice=0;
        for (int i = 0; i < quantity; i++) { // I will loop till reach i=5
             System.out.println("Enter the cost of the item: "); //
             double itemPrice = sc.nextDouble();
             totalPrice+=itemPrice; //totalPrice=totalPrice+itemPrice //shorthand operator


        }
        System.out.println("The total price is $"+totalPrice);
        }








    }

