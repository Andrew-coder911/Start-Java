class Calculator {

    public static void main(String[] args) {
        System.out.println("1. \"Калькулятор\"");
        int num1 = 4;
        int num2 = 0;
        int extent = num2;
        int result = 0;
        char sign = '^';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            while (extent != 0) {
                result *= num1;
                extent--;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}