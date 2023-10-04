package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer = "yes";
        while (!"no".equals(userAnswer)){
            if ("yes".equals(userAnswer)) {
                System.out.println("Введите математическое выражение в формате 2 + 2 :");
                String expression = scan.nextLine();
                System.out.print(expression + " = ");
                print(Calculator.calculate(expression));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scan.nextLine();
        }
    }

    public static void print(double result) {
        if (result % 1 != 0) {
            System.out.printf("%.3f\n", result);
        } else {
            System.out.println((int) result);
        }
    }
}