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

        System.out.println("\n2.Игра \"Угадай число\"");
        int compNum = 31;
        int personNum = 40;
        boolean correct = true;
        if (compNum > 0 && compNum <= 100) {
            do {
                if (personNum > compNum) {
                    System.out.println("Число " + personNum + " больше того что загадал компьютер");
                    personNum--;
                } else if (personNum < compNum) {
                    System.out.println("Число " + personNum + " меньше того что загадал компьютер");
                    personNum++;
                }else if (personNum == compNum) {
                    System.out.println("Вы победили!");
                    System.out.println("Компьютер загадал число: " + personNum);
                    correct = false;
                }
            } while (correct);
        }
    }
}