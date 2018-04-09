package com.overload;
/* Overload method area to calculate area of different objects like rectangle, circle, cube and cylinder. */
class AreaCalculate{
  
  //area of cube
  void area(float a)
  {
    System.out.println("The Area of Cube is : "+6*Math.pow(a,2)+" sq units.");
  }
  
  //area of rectangle
  void area(float a,float b){
    System.out.println("The Area of Rectangle is : "+a*b+" sq units.");
  }
  
  //area of circle
  void area(double r){
    double ar = 3.14*Math.pow(r,2);
    System.out.println("The Area of Circle is : "+ar+" sq units.");
  }
  
  //area of cylinder
   void area(double r , double h){
     double ar = 2*3.14*r*(r+h);
     System.out.println("The Area of Cylinder is : "+ar+" sq units.");
   }
}
public class OverloadMethod {

  public static void main(String[] args) {
     AreaCalculate object = new AreaCalculate();
     
     object.area(5.3f);
     object.area(11.2f,20.2f);
     object.area(2.5);
     object.area(3,4.5);
     
  }
}