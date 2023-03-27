class CyclesTheme{

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int pointA = -10;
        int pointB = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (pointA % 2 == 0) {
                sumEven += pointA;
            } else {
                sumOdd += pointA;
            }
            pointA++;
        } while (pointA <= pointB);
        System.out.printf("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", 
                sumEven, sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.printf("Числа в интервале (%d, %d) в порядке убывания\n", min, max);
        for (int i = --max; i > min; i--) {
            System.out.printf("%d", i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int num1Thousands = 0;
        int num1Hundreds = 0;
        int num1Tens = 0;
        int num1Ones = 0;
        int i = 0;
        int count = 4;
        int sum = 0;
        while (num1 != 0){
            i = num1 % 10;
            if (count == 4) {
                num1Ones = i;
            } else if (count == 3) {
                num1Tens = i;
            } else if (count == 2) {
                num1Hundreds = i;
            } else {
                num1Thousands = i;
            }
            num1 /= 10;
            count--;
        }
        sum = num1Thousands + num1Hundreds + num1Tens + num1Ones;
        System.out.println("Исходное число в обратном порядке: " + num1Ones + num1Tens
                + num1Hundreds + num1Thousands);
        System.out.println("Сумма его цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        pointA = 1;
        pointB = 24;
        count = 0;
        int lineSize = 5;
        int numCount = 0;
        int lineCount = 0;
        int remainNum = 0;
        for (i = pointA; i < pointB; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count >= lineSize) {
                System.out.println("\n");
                count = 0;
            }
            numCount++;
        }
        remainNum = lineSize - numCount % lineSize;
        if (pointB / lineSize <= lineSize){
            for (i = 0; i < remainNum; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int numBefore = num1;
        int countTwo = 0;
        String evenOdd = "";
        while (num1 != 0) {
            i = num1 % 10;
            if (i == 2) {
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

        for (i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("*");
            }
            System.out.print("\n");
        }

        i = 5;
        while (i >= 1){
            int j = 1;
            while (j <= i){
                System.out.print("#");
                j++;
            }
            System.out.print("\n");
            i--;
        }
        
        num1 = 5;
        i = 1;
        int j = 1;
        do {
            num2 = 0;
            do {
                System.out.print("$");
                num2++;
            } while (num2 < i);
            System.out.print("\n");
            if(j < 3){
                i++;
            } else if (j >= 3) {
                i--;
            }
            j++;
            num1--;
        } while (num1 > 0);

        System.out.println("\n7.Отображение ASCII-символов");
        char symbol = 0;
        for (i = 0; i <= 127; i++) {
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
            i = num1 % 10;
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
        count = 0;
        num1Thousands = 0;
        num1Hundreds = 0;
        int sumStart = 0;
        int sumEnd = 0;
        while (num1 != 0) {
            i = num1 % 10;
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
        for (i = 1; i < 10; i++) {
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
            for (j = 1; j < 10; j++) {
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