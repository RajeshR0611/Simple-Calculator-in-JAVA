package com.rajesh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Simple Calculator Menu");
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for subtraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");
            System.out.println("Choose 5 for Modulus");
            System.out.println("Choose 6 for Power");
            flag = false;
        }
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                //Add
                System.out.println("Enter 1st no for addition:");
                 int a1 = sc.nextInt();
                System.out.println("Enter 2st no for addition:");
                 int a2 = sc.nextInt();
                int addresult = a1+a2;
                System.out.println("The addition of "+ a1 + " and "+a2 + " is : "+ addresult);
                flag = true;
                break;
            case 2:
                System.out.println("Enter 1st no for Subtraction:");
                int s1 = sc.nextInt();
                System.out.println("Enter 2st no for Subtraction:");
                int s2 = sc.nextInt();
                int subresult = s1-s2;
                System.out.println("The subtraction of "+ s1 + " and "+s2 + " is : "+ subresult);
                break;
            case 3:
                System.out.println("Enter 1st no for Multiplication:");
                int m1 = sc.nextInt();
                System.out.println("Enter 2st no for Multiplication:");
                int m2 = sc.nextInt();
                int mulresult = m1*m2;
                System.out.println("The multiplication of "+ m1 + " and "+m2 + " is : "+ mulresult);
                break;

            case 4:
                System.out.println("Enter divisor:");
                int d1 = sc.nextInt();
                System.out.println("Enter dividend:");
                int d2 = sc.nextInt();
                int divresult = d1/d2;
                System.out.println("The division of "+ d1 + " and "+d2 + " is : "+ divresult);
                break;
            case 5:
                System.out.println("Enter divisor:");
                int d3 = sc.nextInt();
                System.out.println("Enter modulent:");
                int d4 = sc.nextInt();
                int modresult = d3%d4;
                System.out.println("The modulus of "+ d3 + " and "+d4 + " is : "+ modresult);
                break;

            case 6:
                System.out.println("Enter base:");
                int base = sc.nextInt();
                System.out.println("Enter power:");
                int power = sc.nextInt();
                int powresult =(int) Math.pow(base,power) ;
                System.out.println("The power of "+ base + " and "+power + " is : "+ powresult);
                break;
            default:
                System.out.println("Your option is out of range");

        }
    }
}
