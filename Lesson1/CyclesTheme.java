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
    }
}