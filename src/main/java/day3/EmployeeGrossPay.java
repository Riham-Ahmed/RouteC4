package day3;
import java .util.Scanner;
public class EmployeeGrossPay {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int hourRate = 15;
int weeklyWorkingHours=40;
System.out.println("Enter your weekly working hours: ");
double empWorkingHours = sc.nextDouble();
while (empWorkingHours > weeklyWorkingHours ||empWorkingHours<=0)
    {
        System.out.println("Invalid Entry , please enter between 1h to 40h ");
        System.out.println("Enter your weekly working hours: ");
        empWorkingHours = sc.nextDouble(); // stopper
        // break ; BUG!
    }

double salary = empWorkingHours*hourRate;
System.out.println("Your weekly gross salary is : "+salary+"$");



    }


    }
