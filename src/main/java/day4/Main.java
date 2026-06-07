package day4;

public class Main {
    static void main(String[] args) { // static class must static method
//    Sum s= new Sum();
//    s.sum2Number(10,20);
//    s.sum2Number(105,52);
//        hamada();
//    }
//    //static method may class static or not
//    public static void hamada()
//    {
//        System.out.println("Hello ,Hamada");
//    }


     //   Rectangle R=new Rectangle();
     // double x=  R.calculateArea();
      // System.out.println("The value of x is "+ x);




        Rectangle r1=new Rectangle();
        r1.setLength(5.5);
        r1.setWidth(5.5);
        double areaOfRoom1= r1.calculateArea();
        System.out.println("The area of the room is: "+areaOfRoom1);
        Rectangle r2=new Rectangle();
        r2.setLength(10.5);
        r2.setWidth(12.5);
        double areaOfRoom2= r2.calculateArea();
        System.out.println("The area of the room is: "+areaOfRoom2);
        System.out.println("==================");
        double totalArea= areaOfRoom1+areaOfRoom2;
        System.out.println("The  total area of  room1 and room2 is : "+totalArea);
    }
}
