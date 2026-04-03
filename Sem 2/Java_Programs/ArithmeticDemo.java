//PROGRAM-16
//Create an arithmetic package that has classes and interfaces for basic arithmetic operations (Addition, Subtraction, Multiplication, Division).
//Test the package by implementing all operations on two given numbers.

import arithmetic.*;

public class ArithmeticDemo {
    public static void main(String[] args) {

        double a = 10, b = 5;

        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}