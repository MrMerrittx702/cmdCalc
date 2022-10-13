package edu.csa.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.csa.calculator.Calculator;

class CalculatorTest {

  @Test
  void testAdd() {
    assertEquals(4, Calculator.add(2,2));
  }

  @Test
  void testSubtract() {
    assertEquals(2, Calculator.subtract(5,3));
  }

  @Test
  void testMultiply() {
    assertEquals(0, Calculator.multiply(4,0));
  }

  @Test
  void testDivide() {
    assertEquals(4, Calculator.divide(100,25));
  }

  @Test
  void testRemainder() {
    assertEquals(1, Calculator.remainder(99,2));
  }

  @Test
  void testAreaOfCircle() {
    Calculator geometry = new Calculator();
    assertEquals(301.5656000000001, geometry.areaOfCircle(9.8));
  }

  @Test
  void testAreaOfRect() {
    Calculator geometry = new Calculator();
    assertEquals(100, geometry.areaOfRect(25,4));
  }

  @Test
  void testAreaOfTri() {
    Calculator geometry = new Calculator();
    assertEquals(250, geometry.areaOfTri(50, 10));
  }

}
