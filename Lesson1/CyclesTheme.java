class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= endRange);
        System.out.printf("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", 
                sumEven, sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 < min) {
            min = num2;
        } else if (num2 > max) {
            max = num2;
        }
        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }
        System.out.printf("Числа в интервале (%d, %d) в порядке убывания\n", min, max);
        for (int i = --max; i > min; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sum = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            System.out.println("Исходное число в обратном порядке: " + digit );
            sum += digit;
            num1 /= 10;
        }
        System.out.println("Сумма его цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int startRange = 1;
        endRange = 24;
        int countNumsInLine = 0;
        int countLines = 5;
        for (int i = startRange; i < endRange; i += 2) {
            System.out.printf("%3d", i);
            countNumsInLine++;
            if (countNumsInLine >= countLines) {
                System.out.println();
                countNumsInLine = 0;
            }
        }
        int remainNum = countLines - countNumsInLine;
        if (remainNum > 0 && remainNum < 5) {
            for (int i = 0; i < remainNum; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int copyNum1 = num1;
        int countTwos = 0;
        String evenOdd = "";
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                countTwos++;
            }
            num1 /= 10;
        }
        if (countTwos % 2 == 0) {
            evenOdd = "-четное ";
        } else {
            evenOdd = "-нечетное ";
        }
        System.out.println("Число " + copyNum1 + " содержит " + countTwos + evenOdd
                 + " количество двоек");

        System.out.println("\n6.Отображение фигур в консоли");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        int countChars = 5;
        while (countChars >= 1) {
            countLines = 1;
            while (countLines <= countChars) {
                System.out.print("#");
                countLines++;
            }
            System.out.println();
            countChars--;
        }
        
        countLines = 5;
        countChars = 1;
        int limiter = 1;
        do {
            int countCharsInLine = 0;
            do {
                System.out.print("$");
                countCharsInLine++;
            } while (countCharsInLine < countChars);
            System.out.println();
            if(limiter < 3) {
                countChars++;
            } else if (limiter >= 3) {
                countChars--;
            }
            limiter++;
            countLines--;
        } while (countLines > 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%5s%5s%n", "Dec", "Char");
        for (int i = 0; i <= 127; i++) {
            if (i % 2 != 0 && i <= 47) {
                if (i == 29) {
                    System.out.printf("%6d%5c%n", i, i);
                } else {
                    System.out.printf("%5d%5c%n", i, i);
                }
            } else if (i % 2 == 0 && i >= 97 && i <= 122) {
                System.out.printf("%5d%5c%n", i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num1 = 1234321;
        copyNum1 = num1;
        int palindrome = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            palindrome = palindrome * 10 + digit;
            num1 /= 10;
        }
        if (copyNum1 == palindrome) {
            System.out.printf("Число %d является палиндромом\n", copyNum1);
        } else {
            System.out.printf("Число %d не является палиндромом\n", copyNum1);
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num1 = 123321;
        int count = 0;
        int leftHalf = 0;
        int rightHalf = 0;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            if (count < 3) {
                //leftHalf = leftHalf * 10 + digit;
                sumLeftHalf += digit;
            } else {
                rightHalf = rightHalf * 10 + digit;
                sumRightHalf += digit;
            }
            count++;
            num1 /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\n", leftHalf, sumLeftHalf);
        System.out.printf("Сумма цифр %d = %d\n", rightHalf, sumRightHalf);
        if (sumRightHalf == sumLeftHalf) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        //count = 0;
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            } else if (i == 2) {
                for (int j = 0; j < 9; j++) {
                    System.out.print("___");
                }
                System.out.print("_");
                System.out.println();
            }
            for (int j = 1; j < 10; j++) {
                if (i * j != 1) {
                    System.out.printf("%3d", i * j);
                }
                if (i * j == i) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}