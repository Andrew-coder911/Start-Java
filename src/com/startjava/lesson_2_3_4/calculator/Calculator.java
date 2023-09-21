package com.startjava.lesson_2_3_4.calculator;

import java.lang.String;

class Calculator {
    private String userExpression;
    private String[] splitString;
    private int num1;
    private int num2;
    private char sign;
    public void setUserExpression(String userExpression) {
        this.userExpression = userExpression;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public char getSign() {
        return sign;
    }

    private void stringSplit() {
        splitString = userExpression.split(" ");
    }

    public double calculate() {
        stringSplit();
        num1 = Integer.parseInt(splitString[0]);
        num2 = Integer.parseInt(splitString[2]);
        sign = splitString[1].charAt(0);
        //double result = 0;
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
                return Math.pow(num1,num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Введенная математическая операция не поддерживается.");
        }
        return 0;
    }
}