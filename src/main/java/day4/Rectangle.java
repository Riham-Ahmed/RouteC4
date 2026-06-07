package day4;

import java.util.Scanner;
//class =>blue print, container
public class Rectangle {
   //Encapsulation => data hiding , data protection , data security
    //data hiding :prevent direct modification of fields

   private double length; //field
    private double width ; //field

    Scanner sc = new Scanner(System.in);

    public void setLength(double length) {
        if(length>0)
        this.length = length;
        else
            System.out.println("Length must be positive");
    }
    public void setWidth(double width) {

        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {

        return width;
    }
    public double  calculateArea()
    {

        return  width*length;
        //   = getLength()*getWidth()
    }

//    public double calculateArea() {
//        System.out.println("Enter the length of the rectangle: ");
//        length = sc.nextDouble();
//        System.out.println("Enter the width of the rectangle: ");
//        width = sc.nextDouble();
//        double area = length * width;
//        System.out.println("The area of the rectangle is: " + area);
//
//return area;
//    }

}
