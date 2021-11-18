/*Find the largest of 2 numbers and largest of 3 numbers(Apply method overloading concept)*/
package Polymorphism;

import java.util.Scanner;

public class LargestOfNum {
    int largest;

    public void findLargest(int num1,int num2){
        if(num1>num2){
            largest = num1;
        }
        else{
            largest = num2;
        }
        System.out.println("The largest of two numbers is " + largest);

    }
    public void findLargest(int num1,int num2,int num3){
        largest = num1;
        if(largest<num2)
            largest = num2;
        if(largest<num3)
            largest = num3;

        System.out.println("The largest of three numbers is " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the following option you prefer: \n 1.Largest of two numbers \n 2.Largest of three numbers");
        System.out.println("Enter option:");
        int option;
        int num1;
        int num2;
        int num3;
        //create a object of LargestNum class
        LargestOfNum obj = new LargestOfNum();

        option= sc.nextInt();
        if(option == 1){
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            if(num1 == num2){
                System.out.println("Enter teo different numbers");
            }
            else {
                obj.findLargest(num1, num2);
            }
        }
        else if(option == 2){
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            System.out.println("Enter third number");
            num3 = sc.nextInt();
            if(num1 == num2 || num2 == num3){
                System.out.println("Enter three different numbers");
            }
            else {
                obj.findLargest(num1, num2, num3);
            }
        }

    }
}
