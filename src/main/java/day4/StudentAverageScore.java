package day4;

import java.util.Scanner;

public class StudentAverageScore {
    static void main(String[] args) {
        int numberOfStudents=3;
        int numberOfCourses=4;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=numberOfStudents; i++) {
            int total=0 ;
            for (int j=1; j<=numberOfCourses; j++) {


                System.out.print("Enter scour for course "+ j+ " For Student "+i );
                double score = sc.nextDouble();
                total +=score;
            }
            double Average = total / numberOfCourses;
            System.out.println("The Average of student "+i + " is "+ Average);
            System.out.println();




        }

    }
}
