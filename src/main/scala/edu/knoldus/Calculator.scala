package edu.knoldus

class Calculator {

  def add(a:Int, b:Int): Int = {
    a + b
  }

  def subtract(a:Int, b:Int): Int = {
    a - b
  }

  def multiply(a:Int, b:Int): Int = {
    a * b
  }

  def divide(a:Int, b:Int): Double = {
    require(b!=0)
    a / b.toDouble
  }

  def power(a:Int, b:Int, c:Int = 1): Double = {
    if (b<0) {
      1.0 / power(a, -b)
    }
    else if (b==0) {
      c
    }
    else {
      power(a, b - 1, c * a)
    }
  }

  def modulus(a:Int, b:Int): Int = {
    require(b != 0)
    if ((a>0 && b>0) || (a<0 && b<0)) {
      val t = a / b
      a - (b * t)
    }
    else if (a<0 && b>0) {
      val a2 = -a
      val t2 = a2 / b
      b - (a2 - (b * t2))
    }
    else {
      -modulus(-a, -b)
    }
  }

  def absolute(a:Int): Int = {
    if (a < 0) {
      -a
    }
    else {
      a
    }
  }

  def maximum(a:Int, b:Int): Int = {
    if (a > b) {
      a
    }
    else {
      b
    }
  }

  def minimum(a:Int, b:Int): Int = {
    if (a < b) {
      a
    }
    else {
      b
    }
  }

}
