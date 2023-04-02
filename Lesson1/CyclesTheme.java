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
        num2 = 0;
        int digit = 0;
        int sum = 0;
        while (num1 != 0){
            digit = num1 % 10;
            num2 = num2 * 10 + digit;
            sum += digit;
            num1 /= 10;
        }
        System.out.println("Исходное число в обратном порядке: " + num2);
        System.out.println("Сумма его цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int pointA = 1;
        int pointB = 24;
        int countNumsInLine = 0;
        int countLines = 5;
        int numCount = 0;
        int lineCount = 0;
        int remainNum = 0;
        for (int i = pointA; i < pointB; i += 2) {
            System.out.printf("%3d", i);
            countNumsInLine++;
            if (countNumsInLine >= countLines) {
                System.out.print("\n");
                countNumsInLine = 0;
            }
            numCount++;
        }
        remainNum = countLines - numCount % countLines;
        if (pointB / countLines <= countLines) {
            for (int i = 0; i < remainNum; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int numBefore = num1;
        int countTwo = 0;
        String evenOdd = "";
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                countTwo++;
            }
            num1 /= 10;
        }
        if (countTwo % 2 == 0) {
            evenOdd = "-четное ";
        } else {
            evenOdd = "-нечетное ";
        }
        System.out.println("Число " + numBefore + " содержит " + countTwo + evenOdd
                 + " количество двоек");

        System.out.println("\n6.Отображение фигур в консоли");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("*");
            }
            System.out.print("\n");
        }

        int countChar = 5;
        while (countChar >= 1){
            countLines = 1;
            while (countLines <= countChar){
                System.out.print("#");
                countLines++;
            }
            System.out.print("\n");
            countChar--;
        }
        
        countLines = 5;
        countChar = 1;
        int limiter = 1;
        do {
            int countCharInLines = 0;
            do {
                System.out.print("$");
                countCharInLines++;
            } while (countCharInLines < countChar);
            System.out.print("\n");
            if(limiter < 3){
                countChar++;
            } else if (limiter >= 3) {
                countChar--;
            }
            limiter++;
            countLines--;
        } while (countLines > 0);

        System.out.println("\n7.Отображение ASCII-символов");
        char symbol = 0;
        for (int i = 0; i <= 127; i++) {
            if (i == 0) {
                System.out.printf("%5s%5s%n", "Dec", "Char");
            } else if (i % 2 != 0 && i <= 47) {
                symbol = (char) i;
                if (i == 29) {
                    System.out.printf("%6d", i);
                    System.out.printf("%6c%n", symbol);
                }
                System.out.printf("%5d", i);
                System.out.printf("%5c%n", symbol);
            } else if (i % 2 == 0 && i >= 97 && i <= 122) {
                symbol = (char) i;
                System.out.printf("%5d", i);
                System.out.printf("%5c%n", symbol);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num1 = 1234321;
        int startNum = num1;
        int polindromNum = 0;
        while (num1 != 0) {
            int i = num1 % 10;
            polindromNum = polindromNum * 10 + i;
            num1 /= 10;
        }
        if (startNum == polindromNum) {
            System.out.printf("Число %d является палиндромом\n", startNum);
        } else {
            System.out.printf("Число %d не является палиндромом\n", startNum);
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num1 = 123321;
        startNum = num1;
        int count = 0;
        int num1Thousands = 0;
        int num1Hundreds = 0;
        int sumStart = 0;
        int sumEnd = 0;
        while (num1 != 0) {
            int i = num1 % 10;
            if (count < 3) {
                num1Thousands = num1Thousands * 10 + i;
                sumEnd += i;
            } else {
                num1Hundreds = num1Hundreds * 10 + i;
                sumStart += i;
            }
            count++;
            num1 /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\n", num1Thousands, sumEnd);
        System.out.printf("Сумма цифр %d = %d\n", num1Hundreds, sumStart);
        if (sumStart == sumEnd) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        count = 0;
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            } else if (i == 2) {
                while (count < 9) {
                    System.out.print("___");
                    count++;
                }
                System.out.print("_");
                System.out.println("");
            }
            for (int j = 1; j < 10; j++) {
                if (i * j != 1) {
                    System.out.printf("%3d", i * j);
                }
                if (i * j == i) {
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }
}