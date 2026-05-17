package dayOne;

public class FirstJavaProgram {
    public static void main (String []args) {


       //  System.out.println("Hello big boy");
        // comment line

        /*
        System.out.println("Hello big boy ");
         */
        // variable
        // Declaration
        // DataType VariableName =  value ; -> Initialization
//        String firstName = "Marwa"; // store text into variable  -> string can contain letters , numbers and special characters
//        String x ="2 +2 ";
//        System.out.println(x);
//        String X= "10";
//        String Y= "15";
//        System.out.println( X+Y ); // concatenation  -> 1015

        // Numbers
        // 1- int
//        int a =1 ;
//        int b = 2;
//        System.out.println( a + b  );
      //  System.out.println( "Sum of a And b is " + a + b  );
//        System.out.println( "Sum of a And b is "   );
//        System.out.println( a + b  );


        // 2- float
//    float f= 9.05F ; // 9.05
//        System.out.println(f );
//
//
        // 3- Double
//        double d = 55; // 55.0
//        double l = 55.33 ; // 55.33
//        System.out.println(d);
//        System.out.println(l);




        String firstName = "Yara";
        String lastName = "Mostafa";
        String fullName = firstName +" "+lastName;  // concatenation  -> combining two strings together
         int age= 19;
          String dateOfBirth = " 20/05/2002";
          String job =" Testing Engineer ";
          double income =10.5;
          double tax =income*0.15 ; //15% tax
        double netSalary =income-tax;


          // print
        System.out.println("Hello my name is : "+ fullName+ "\n my age is : "+age +"\n my job is : " + job +"\n my income is : " + netSalary);
        System.out.println("_____________________________________");
        System.out.printf("Hello my  full name is : %s%n "+" my age is : %d%n  " +" my job is : %s%n "  +" my income is : %f%n ",fullName,age,job,netSalary);










    }
}
