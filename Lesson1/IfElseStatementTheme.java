public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 31;
        if(age > 20) {
            System.out.println("Тебе больше 20!");
        } else {
            System.out.println("Тебе меньше 20!");
        }

        boolean male = true;
        if (!male) {
            System.out.println("Ты женщина!");
        } else {
            System.out.println("Ты мужчина!");
        }

        float height = 1.83f;
        if (height < 1.80f) {
            System.out.println("Ты не высок.");
        } else {
            System.out.println("Ты достаточно высокий.");
        }

        String nameFirstLetter = "Andrew";
        if(nameFirstLetter.charAt(0) == 'M') {
            System.out.println("Ты не Андрей");
        } else if (nameFirstLetter.charAt(0) == 'I'){
            System.out.println("Все еще не Андрей");
        } else {
            System.out.println("Возможно что тебя зовут Андрей)\n");
        }

        System.out.println("2.Поиск max и min числа");
        int num1 = 70;
        int num2 = 70;
        System.out.printf("Первое число - %d \nВторое число - %d\n", num1, num2);
        if (num1 > num2) {
            System.out.printf("Число %d - max\n", num1);
            System.out.printf("Число %d - min\n", num2);
        } else if (num1 < num2) {
            System.out.printf("Число %d - min\n", num1);
            System.out.printf("Число %d - max\n", num2);
        } else {
            System.out.println("Оба числа равны");
        }

        System.out.println("\n3.Проверка числа");
        int num = -3;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " - четное.");
            } else {
                System.out.println("Число " + num + " - нечетное.");
            }

            if (num > 0) {
                System.out.println("Число " + num + " - положительное.");
            } else {
                System.out.println("Число " + num + " - отрицательное.");
            }
        } else {
            System.out.println("Число равно:" + num);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 123;
        int numOneHundreds = num1 / 100;
        int numOneTens = (num1 % 100) / 10;
        int numOneOnes = num1 % 10;

        int numTwoHundreds = num2 / 100;
        int numTwoTens = (num2 % 100) / 10;
        int numTwoOnes = num2 % 10;

        System.out.println("Первое число = " + num1);
        System.out.println("Второе число = " + num2);

        if (numOneHundreds == numTwoHundreds || numOneTens == numTwoTens || numOneOnes == numTwoOnes) {
            if (numOneHundreds == numTwoHundreds) {
                System.out.println("\nСотни:\n3-ий разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        numOneHundreds, numTwoHundreds);
            }

            if (numOneTens == numTwoTens) {
                System.out.println("\nДесятки:\n2-ой разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        numOneTens, numTwoTens);
            }

            if (numOneOnes == numTwoOnes) {
                System.out.println("\nЕдиницы:\n1-ый разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        numOneOnes, numTwoOnes);
            }
        } else {
            System.out.println("Все цифры в разрядах разные.");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println("Символ - " + symbol);
        if (symbol >= '1' && symbol <= '9') {
            System.out.println("Это число.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это маленькая буква.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Это большая буква.");
        } else {
            System.out.println("Это не буква и не число.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int sum;
        float percent = 0.1f;
        System.out.println("Сумма вклада: " + deposit);
        if (deposit < 100000) {
            percent = 0.05f;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 0.07f;
        }
        sum = (int) (deposit + deposit * percent);
        System.out.println("Начисленный процент: " + percent);
        System.out.println("Итоговая сумма с %: " + sum);

        System.out.println("\n7.Определение оценки по предметам");
        int gradeHistory = 59;
        int gradeProgram = 91;
        int history = 5;
        int programming = 5;
        if (gradeHistory <= 60) {
            System.out.println("Оценка: 2 - История");
            history = 2;
        } else if (gradeHistory > 60 && gradeHistory <= 73) {
            System.out.println("Оценка: 3 - История");
            history = 3;
        } else if (gradeHistory > 73 && gradeHistory <= 91) {
            System.out.println("Оценка: 4 - История");
            history = 4;
        } else {
            System.out.println("Оценка: 5 - История");
            history = 5;
        }

        if (gradeProgram <= 60) {
            System.out.println("Оценка: 2 - Программирование");
            programming = 2;
        } else if (gradeProgram > 60 && gradeProgram <= 73) {
            System.out.println("Оценка: 3 - Программирование");
            programming = 3;
        } else if (gradeProgram > 73 && gradeProgram <= 91) {
            System.out.println("Оценка: 4 - Программирование");
            programming = 4;
        } else {
            System.out.println("Оценка: 5 - Программирование");
            programming = 5;
        }
        System.out.println("Средний балл оценок по предметам: " + (history + programming) / 2);
        System.out.println("Средний % по предметам: " + (gradeHistory + gradeProgram) / 2);

        System.out.println("\n8.Расчет прибыли за год");
        int monthRent = 5000;
        int midSell = 13000;
        int costPrice = 9000;
        int income = (midSell * 12) - (costPrice * 12) - (monthRent * 12);
        char sign = 0;
        if (income > 0)
            sign = '+';
        System.out.println("Прибыль за год: " + sign + income + " руб.");

        System.out.println("\n9.Подсчет количества банкнот");
        int withdrawMoney = 567;
        int hundredsAtm = 4;
        int tensAtm = 7;
        int onesAtm = 100;
        int hundredsToIssue = 0;
        int tensToIssue = 0;
        int onesToIssue = 0;
        int sumAtm = hundredsAtm * 100 + tensAtm * 10 + onesAtm;
        int withdrawMoneyHundreds = withdrawMoney / 100; //5
        int withdrawMoneyTens = (withdrawMoney % 100) / 10; //6
        int withdrawMoneyOnes = withdrawMoney % 10; //7
        if (withdrawMoney <= sumAtm && withdrawMoney != 0) {
            if (withdrawMoneyHundreds <= hundredsAtm) {
                hundredsToIssue = withdrawMoneyHundreds;
            } else {
                hundredsToIssue = hundredsAtm;
                hundredsAtm = (hundredsAtm - withdrawMoneyHundreds) * 10;
                withdrawMoneyTens -= hundredsAtm;
            }

            if (withdrawMoneyTens <= tensAtm) {
                tensToIssue = withdrawMoneyTens;
            } else {
                tensToIssue = tensAtm;
                tensAtm = tensAtm - withdrawMoneyTens;
                withdrawMoneyOnes = withdrawMoneyOnes - (tensAtm * 10);
            }

            if (withdrawMoneyOnes <= onesAtm) {
                onesToIssue = withdrawMoneyOnes;
            }
            System.out.println("банкноты номиналом 100:");
            System.out.println("Требуемое количество: " + withdrawMoneyHundreds);
            System.out.println("Выдаваемая сумма: " + (hundredsToIssue * 100));
            System.out.println("банкноты номиналом 10:");
            System.out.println("Требуемое количество: " + withdrawMoneyTens);
            System.out.println("Выдаваемая сумма: " + (tensToIssue * 10));
            System.out.println("банкноты номиналом 1:");
            System.out.println("Требуемое количество: " + withdrawMoneyOnes);
            System.out.println("Выдаваемая сумма: " + (onesToIssue));
        } else {
            System.out.println("В банкомате не достаточно денег или запрошена некорректная сумма");
        }
    }
}