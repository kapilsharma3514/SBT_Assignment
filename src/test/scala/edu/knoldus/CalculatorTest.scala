package edu.knoldus

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {

  val cal = new Calculator

  test("Test for Addition") {
    assert(cal.add(2,3) === 5)
  }

  test("Test for Subtraction") {
    assert(cal.subtract(2,3) === -1)
  }

  test("Test for Multiply (Both Positive)") {
    assert(cal.multiply(2,3) === 6)
  }

  test("Test for Multiply (Both Negative)") {
    assert(cal.multiply(-2,-3) === 6)
  }

  test("Test for Multiply (one neg one pos)") {
    assert(cal.multiply(2,-7) === -14)
  }

  test("Test for Divide (By Zero)") {
    intercept[java.lang.IllegalArgumentException] {
      cal.divide(1,0)
    }
  }

  test("Test for Divide (By Non Zero)") {
    assert(cal.divide(2,4) === 0.5)
  }

  test("Test for Power (When Power is Zero)") {
    assert(cal.power(2,0) === 1.0)
  }

  test("Test for Power (When Power is > 0") {
    assert(cal.power(2,3) === 8.0)
  }

  test("Test for Power (When Power is < 0") {
    assert(cal.power(2,-1) === 0.5)
  }

  test("Test for Modulus (When Mod by 0") {
    intercept[java.lang.IllegalArgumentException] {
      cal.modulus(2,0)
    }
  }

  test("Test for Modulus (Positive Number When Mod by Positive") {
    assert(cal.modulus(9,4) === 1)
  }

  test("Test for Modulus (Positive Number When Mod by Negative") {
    assert(cal.modulus(9,-4) === -3)
  }

  test("Test for Modulus (Negative Number When Mod by Negative") {
    assert(cal.modulus(-9,-4) === -1)
  }

  test("Test for Modulus (Negative Number When Mod by Positive") {
    assert(cal.modulus(-9,4) === 3)
  }

  test("Test for Maximum (a<b)") {
    assert(cal.maximum(2,3) === 3)
  }

  test("Test for Maximum (a>b)") {
    assert(cal.maximum(3,2) === 3)
  }

  test("Test for Minimum (a<b)") {
    assert(cal.minimum(2,3) === 2)
  }

  test("Test for Minimum (a>b)") {
    assert(cal.minimum(3,2) === 2)
  }

  test("Test for Absolute < 0") {
    assert(cal.absolute(-1) === 1)
  }

  test("Test for Absolute >= 0") {
    assert(cal.absolute(0) === 0)
  }

}
