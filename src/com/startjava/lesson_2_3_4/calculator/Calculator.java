package com.startjava.lesson_2_3_4.calculator;

import java.lang.String;

class Calculator {

    public static double calculate(String userExpression) {
        String[] splitString = userExpression.split(" ");
        num1 = Integer.parseInt(splitString[0]);
        num2 = Integer.parseInt(splitString[2]);
        sign = splitString[1].charAt(0);
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается!");
                return Double.MIN_VALUE;
        }
    }
}