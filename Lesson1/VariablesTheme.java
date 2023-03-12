public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значение переменных в консоль.\n");

        byte coreAmount = 8;
        short monitorAmount = 2;
        int ramMBites = 16000;
        long ramBites = 17179869184L;
        float frequencyCpu = 3.6f;
        double pi = 3.1415926535;
        char nameLetter = 'A';
        boolean working = true;
        
        System.out.println("Кол-во ядер в моем ПК: " + coreAmount + " шт.");
        System.out.println("Кол-во мониторов в моем ПК: " + monitorAmount + " шт.");
        System.out.printf("Объем оперативной памяти в Мб: %d Mb\n", ramMBites);
        System.out.printf("Тот же объем в байтах: %d B\n", ramBites);
        System.out.println("Частота процессора моего ПК: " + frequencyCpu + " Hz");
        System.out.println("Десять чисел после запятой числа ПИ: " + pi);
        System.out.printf("Первая буква моего имени: %c\n", nameLetter);
        System.out.println("Сейчас компьютер включен? - " + working);

        System.out.println("\n2.Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        int sum = penPrice + bookPrice;
        float discount = 0.11f;
        
        System.out.printf("Ручка без скидки стоит: %d руб.\n", penPrice);
        System.out.printf("Книга без скидки стоит: %d руб.\n", bookPrice);
        System.out.println("общая стоимость товаров без скидки: " + sum);
        System.out.println("Скидка составляет: " + String.format("%.0f", discount * 100f) + "%");
        System.out.println("Общая стоимость товаров со скидкой: " + 
                String.format("%.0f",(sum * (1 - discount))) + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        
        System.out.println("Bite первоначальное значение: " + byteMax);
        System.out.println("Bite значение после инкремента: " + ++byteMax);
        System.out.println("Bite значение после декремента " + --byteMax);

        System.out.println("Short первоначальное значение: " + shortMax);
        System.out.println("Short значение после инкремента: " + ++shortMax);
        System.out.println("Short значение после декремента " + --shortMax);

        System.out.println("Integer первоначальное значение: " + intMax);
        System.out.println("Integer значение после инкремента: " + ++intMax);
        System.out.println("Integer значение после декремента " + --intMax);

        System.out.println("Long первоначальное значение: " + longMax);
        System.out.println("Long значение после инкремента: " + ++longMax);
        System.out.println("Long значение после декремента " + --longMax);

        System.out.println("\n5.Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        
        System.out.println("Способ с помощью третьей переменной.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d\n", num1, num2);

        System.out.println("Способ с помощью арифметических операций.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d\n", num1, num2);

        System.out.println("Способ с помощью с помощью побитовой операции ^.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d\n", num1, num2);

        System.out.println("\n6.Вывод символов и их кодов\n");

        char numberSign = '#';
        char ampersand = '&';
        char atSymbol = '@';
        char caret = '^';
        char underscore = '_';
        
        System.out.printf("%d %c\n", (int) numberSign, numberSign);
        System.out.printf("%d %c\n", (int) ampersand, ampersand);
        System.out.printf("%d %c\n", (int) atSymbol, atSymbol);
        System.out.printf("%d %c\n", (int) caret, caret);
        System.out.printf("%d %c\n", (int) underscore, underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char openBracket = '(';
        char closeBracket = ')';
        
        System.out.printf("    %c%c    \n", slash, backslash);
        System.out.printf("   %c  %c   \n", slash, backslash);
        System.out.printf("  %c%c%c %c%c  \n", slash, underscore, openBracket, closeBracket, backslash);
        System.out.printf(" %c      %c \n",  slash, backslash);
        System.out.printf("%c%c%c%c%c", slash,underscore,underscore,underscore,underscore);
        System.out.printf("%c%c%c%c%c\n", slash, backslash, underscore,underscore, backslash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        
        System.out.println("Число N содержит:");
        System.out.printf("%d сотен\n", hundreds);
        System.out.printf("%d десятка\n", tens);
        System.out.printf("%d единиц\n", ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение его цифр = " + (hundreds * tens * ones));

        System.out.println("\n9.Вывод времени\n");

        int time = 86399;
        int hours = (time / 60) /60;
        int minutes = (time / 60) % 60;
        int seconds = time % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}