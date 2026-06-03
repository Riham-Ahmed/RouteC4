package day3;

import java.util.Scanner;

public class BreakAndContinueDemo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =1; i<=10; i++){
            if (i==5)
                break;
            System.out.println("Break: "+i);
        }

        System.out.println("___________________________");
        for (int i =1; i<=10; i++){
            if (i==5)
                continue;
            System.out.println("continue: "+i);
        }


        System.out.println("___________________________");
        for (int i =1; i<=10; i--){
            if (i== -5)
               break;
            System.out.println("Break: "+i);
        }


    }
}
