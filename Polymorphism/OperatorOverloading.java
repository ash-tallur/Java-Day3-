package Polymorphism;

import java.util.Scanner;

public class OperatorOverloading {

    public void plusOperator(int num1,int num2){
        //add two numbers
        int result = num1+num2;
        System.out.println("Addition of two numbers " + result);
    }
    public void plusOperator(String first,String second){
        //concatenation of two strings
        String finalWord = first+second;
        System.out.println("Concatenation of two strings " + finalWord);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the following option you prefer: \n 1.Add two numbers \n 2.Concatenate two strings");
        System.out.println("Enter option:");
        int option;
        int num1;
        int num2;
        String first;
        String second;
        //create a object of LargestNum class
        OperatorOverloading obj = new OperatorOverloading();

        option= sc.nextInt();

        if(option ==1){
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            //calling the method plusOperator by sending two numbers
            obj.plusOperator(num1,num2);
        }
        else if (option ==2){
            System.out.println("Enter the first part of string");
            first = sc.next();
            System.out.println("Enter the second part of string");
            second = sc.next();
            //calling the method plusOperator by sending two strings
            obj.plusOperator(first,second);
            }
        }
}
