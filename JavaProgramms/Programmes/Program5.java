package com.constructors;
/* 5. Program explaining application of various types of constructors in Java. */
class CallingConstructors{
  static int a;
  static int b;
  static int sum;
  CallingConstructors(){ /* Default Constructor */
    a = 10;
    b = 20;
    sum = summition(a,b);
  }
  
  CallingConstructors(int x, int y){ /* Parameterized Constructor */
    a = x;
    b = y;
    sum = summition(a,b);
  }
  
  void display(){ //display the output
    System.out.println("a = "+a+" b = "+b+" Sum = "+sum);
  }
  
  int summition(int x,int y){ // computing sum
    return x+y;
  }
}


public class DFConstructors {

  public static void main(String[] args) {
    CallingConstructors obj1 = new CallingConstructors(); // calls the default constructor
    obj1.display();
    CallingConstructors obj2 = new CallingConstructors(2,3); // calls Parameterized Constructor
    obj2.display();
  }
}