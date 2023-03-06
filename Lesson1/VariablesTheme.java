public class VariablesTheme {

    public static void main(String[] args) {
        byte coreAmount = 8;
        short monitorAmount = 2;
        int ramMBites = 16000;
        long ramBites = 17179869184L;
        float frequencyCPU = 3.6f;
        double pi = 3.1415926535;
        char nameLetter = 'A';
        boolean itWork = true;

        System.out.println("1.Вывод значение переменных в консоль.\n");
        System.out.println("Кол-во ядер в моем ПК: " + coreAmount);
        System.out.println("Кол-во мониторов в моем ПК: " + monitorAmount);
        System.out.printf("Объем оперативной памяти в Мб: %d Mb\n", ramMBites);
        System.out.printf("Тот же объем в байтах: %d bites\n", ramBites);
        System.out.println("Частота процессора моего ПК: " + frequencyCPU);
        System.out.println("Десять чисел после запятой числа ПИ: " + pi);
        System.out.printf("Первая буква моего имени: %c\n", nameLetter);
        System.out.println("Сейчас компьютер включен? - " + itWork);

        int pen = 100;
        int book = 200;
        int sum = pen + book;
        float discount = 0.11f;

        System.out.println("\n2.Расчет стоимости товара со скидкой\n");
        System.out.printf("Ручка без скидки стоит: %d руб.\n", pen);
        System.out.printf("Книга без скидки стоит: %d руб.\n", book);
        System.out.println("общая стоимость товаров без скидки: " + sum);
        System.out.println("Скидка составляет: " + String.format("%.0f", discount * 100f) + "%");
        System.out.println("Общая стоимость товаров со скидкой: " + 
            String.format("%.0f",(sum * (1 - discount))) + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        byte biteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n");
        System.out.println("Bite первоначальное значение: " + biteVar);
        biteVar++;
        System.out.println("Bite значение после инкремента: " + biteVar);
        biteVar--;
        System.out.println("Bite значение после декремента " + biteVar);

        System.out.println("Short первоначальное значение: " + shortVar);
        shortVar++;
        System.out.println("Short значение после инкремента: " + shortVar);
        shortVar--;
        System.out.println("Short значение после декремента " + shortVar);

        System.out.println("Integer первоначальное значение: " + intVar);
        intVar++;
        System.out.println("Integer значение после инкремента: " + intVar);
        intVar--;
        System.out.println("Integer значение после декремента " + intVar);

        System.out.println("Long первоначальное значение: " + longVar);
        longVar++;
        System.out.println("Long значение после инкремента: " + longVar);
        longVar--;
        System.out.println("Long значение после декремента " + longVar);

        int num1 = 2;
        int num2 = 5;
        int numChange;

        System.out.println("\n5.Перестановка значений переменных\n");
        System.out.println("Способ с помощью третьей переменной.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        numChange = num1;
        num1 = num2;
        num2 = numChange;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d\n", num1, num2);

        System.out.println("Способ с помощью арифметических операций.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d", num1, num2);

        System.out.println("Способ с помощью с помощью побитовой операции ^.");
        System.out.printf("Начальные значения.\nПервая: %d\nВторая: %d\n", num1, num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.printf("Измененные значения.\nПервая: %d\nВторая: %d\n", num1, num2);

        char firstChar = '#';
        char secondChar = '&';
        char thirdChar = '@';
        char fourChar = '^';
        char fiveChar = '_';
        System.out.println("\n6.Вывод символов и их кодов\n");
        System.out.printf("%d %c\n", (int)firstChar, (char)firstChar);
        System.out.printf("%d %c\n", (int)secondChar, (char)secondChar);
        System.out.printf("%d %c\n", (int)thirdChar, (char)thirdChar);
        System.out.printf("%d %c\n", (int)fourChar, (char)fourChar);
        System.out.printf("%d %c\n", (int)fiveChar, (char)fiveChar);

        char slash = '/';
        char slashBack = '\\';
        char bracket = '(';
        char bracketBack = ')';
        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        System.out.printf("    %c%c    \n", slash, slashBack);
        System.out.printf("   %c  %c   \n", slash, slashBack);
        System.out.printf("  %c%c%c %c%c  \n", slash, fiveChar, bracket, bracketBack, slashBack);
        System.out.printf(" %c      %c \n",  slash, slashBack);
        System.out.printf("%c%c%c%c%c", slash,fiveChar,fiveChar,fiveChar,fiveChar);
        System.out.printf("%c%c%c%c%c\n", slash, slashBack, fiveChar,fiveChar, slashBack);

        int num = 123;
        int hundreds = num / 100;
        int tenner = num / 10;
        int units = num % 120;
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        System.out.println("Число N содержит:");
        System.out.printf("%d сотен\n", hundreds);
        System.out.printf("%d десятков\n", tenner);
        System.out.printf("%d единиц\n", units);
        System.out.println("Сумма его цифр = " + (hundreds + (tenner - 10) + units));
        System.out.println("Произведение его цифр = " + (hundreds * (tenner - 10) * units));

        int seconds = 86399;
        int hours = (seconds / 60) /60;
        int minutes = seconds % 60;        
        int secondsRemind = seconds % 86340;
        System.out.println("\n9.Вывод времени");
        System.out.printf("%d:%d:%d", hours, minutes, secondsRemind);
    }
}