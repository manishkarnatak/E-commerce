package com.prime;
import java.util.Scanner;
/* 1. Program to identify wheather entered number is prime or not. */
public class primecheck {

  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int i;
    for(i=2;i<x;i++){
      if(x%i==0){
        break;
      }
    }
    if(i==x){
      System.out.println("Number is prime");
    }else{
      System.out.println("Number is not prime");
    }
  }
}