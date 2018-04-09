package com.table;
import java.util.Scanner;
/* 2. Program to show table of a given number upto given limit.  */
public class table {

  public static void main(String[] args) {
    System.out.println("Enter Number For Table");
    Scanner input1 = new Scanner(System.in);
    int num = input1.nextInt();
    System.out.println("Upto Which Number You want table");
    Scanner input2 = new Scanner(System.in);
    int upto = input2.nextInt();
    for(int i=1;i<=upto;i++){
      System.out.println(num+" X "+i+" = "+(num*i));
    }
    System.out.println("");
    System.out.println("Program Ends");
  }
}