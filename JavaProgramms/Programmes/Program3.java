package com.factorail;
import java.util.Scanner;
/* 3. Program to calculate factorial of a given number.  */
public class fact {

  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Factorial = "+factorial(num));
  }
  
  private static long factorial(int num){
    if(num == 0){
      return 1;
    }else{
      return num * factorial(num-1);
    }
  }
}