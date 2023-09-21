package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer = "";
        do {
            Calculator calculator = new Calculator();
            System.out.println("Введите математическое выражение в формате 2 + 2 :");
            calculator.setUserExpression(scan.nextLine());
            double result = calculator.calculate();
            System.out.print(calculator.getNum1() + " " + calculator.getSign() + " " +
                    calculator.getNum2() + " = ");
            stringFormat(result);

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scan.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.println("Некорректный ввод. Введите [yes] или [no]");
                userAnswer = scan.nextLine();
            }
        } while (userAnswer.equals("yes"));
    }

    public static void stringFormat(double result) {
        if (result % (int)result != 0) {
            System.out.printf("%.3f", result);
            System.out.println();
        } else {
            System.out.println((int)result);
        }
    }
}