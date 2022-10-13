package edu.csa.calculator;

import java.util.Scanner;

public class Calculator {
  private double pi;

  Calculator(){
    pi = 3.14;
  }

  static int add(int a, int b){
    return a + b;
  }

  static int subtract(int a, int b){
    return a - b;
  }

  static int multiply(int a, int b){
    return a * b;
  }

  static int divide(int a, int b){
    return a / b;
  }

  static int remainder(int a, int b){
    return a % b;
  }

  double areaOfCircle (double r){
    return this.pi * Math.pow(r, 2);
  }

  double areaOfRect(double l, double w){
    return l*w;
  }

  double areaOfTri(double b, double h){
    return 0.5 * b * h;
  }

  public static void main(String[] args){
    

    Calculator geometry = new Calculator(); 

    int run = 0;
    while (run == 0){
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("What would you like to do?");
      System.out.println("add, subtract, multiply, divide");
      System.out.println("Area of: Rectangle, Triangle, Circle");
      System.out.println("absolute value, power, square root");
      System.out.println("exit");System.out.println();

      String answer = input.nextLine();

      if (answer.equals("exit")){
        run = 1;
      }
      else if (answer.equals("add")){
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter an integer");
        int b = input.nextInt();
        System.out.println("The sum is: " + add(a,b));
      }
      else if (answer.equals("subtract")){
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter an integer");
        int b = input.nextInt();
        System.out.println("The difference is: " + subtract(a,b));
      }
      else if (answer.equals("multiply")){
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter an integer");
        int b = input.nextInt();
        System.out.println("The product is: " + multiply(a,b));
      }
      else if (answer.equals("divide")){
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter an integer");
        int b = input.nextInt();
        System.out.println("The quotient is: " + divide(a,b));
      }
      else if (answer.equals("Rectangle")){
        System.out.println("Please enter a double for length");
        double a = input.nextDouble();
        System.out.println("Please enter an double for width");
        double b = input.nextDouble();
        System.out.println("The area of the rectangle is: " + geometry.areaOfRect(a,b));
      }
      else if (answer.equals("Triangle")){
        System.out.println("Please enter a double for base");
        double a = input.nextDouble();
        System.out.println("Please enter an double for height");
        double b = input.nextDouble();
        System.out.println("The area of the triangle is: " + geometry.areaOfTri(a,b));
      }
      else if (answer.equals("Circle")){
        System.out.println("Please enter the radius");
        double r = input.nextDouble();
        System.out.println("The area is: " + geometry.areaOfCircle(r));
      }
      else if (answer.equals("absolute value")) {
        System.out.println("Please enter an integer or double");
        double a = input.nextDouble();
        System.out.println("The absolute value is: " + Math.abs(a));
      }
      else if(answer.equals("power")){
        System.out.println("Please enter a number");
        double a = input.nextDouble();
        System.out.println("Please enter a number");
        double b = input.nextDouble();
        System.out.println("The answer is: " + Math.pow(a,b));
      }
      else if(answer.equals("square root")){
        System.out.println("Please enter a number");
        double a = input.nextDouble();
        System.out.println("The answer is: " + Math.sqrt(a));
      }
      else {
        System.out.println("Please enter a valid answer choice.");
      }

      
    }
  }
}
/* 
 * Directions: Create a simple calculator
 * 
 * Develop a calculator that accepts user input to perform calculations.
 * (Use the java Math class when applicable)(Check the Java quick reference)
 * 
 * Include the following attributes:
 * > a double only accessible by the current class that stores the value of pi.
 * 
 * Include the following objects:
 * > create an object of the scanner class to accept user input. (imported for you)
 * > create a geometry object of the calculator class. 
 * 
 * Implement the following methods: (use the provided identifiers)
 * > Calculator constructor
 * > (add) static method that accepts two integers and returns thier sum.
 * > (sub) static method that accepts two integers and returns thier difference.
 * > (multiply) static method that accepts two integers and returns thier product.
 * > (divide) static method that accepts two integers and returns thier quotient.
 * > (remainder) static method that accepts two integers and returns the remainder of thier division.
 * > (randomNum) static method that accepts two integers and returns a random number between the two values
 * > (areaOfRect) non static method that accepts two doubles and returns the area of a rectangle
 * > (areaOfTri) non static method that accepts two doubles and returns the area of a triangle
 * > (areaOfCircle)non static method that accepts a double input and returns the area of a circle
 * 
 * Include the following methods:
 * > accept an integer or double input and return the absolute value
 * > accept an integer or double input and return the square root
 * > accept two doubles as input and return the first number to the power of the second
 * 
 */
