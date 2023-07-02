package com.startjava.lesson_2_3.calculator;

class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public int calculate() {
        int result = 0;
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Введенная математическая операция не поддерживается.");
        }
        return result;
    }
}