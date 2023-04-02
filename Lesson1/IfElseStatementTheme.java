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
        int num = 0;
        String evenOdd = "";
        String negativePositive = "";
        if (num != 0) {
            if (num % 2 == 0) {
                evenOdd = " четное";
            } else {
                evenOdd = " нечетное";
            }

            if (num > 0) {
                negativePositive = " положительное";
            } else {
                negativePositive = " отрицательное";
            }
            System.out.println("Число " + evenOdd + negativePositive);
        } else {
            System.out.println("Число " + num);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 123;
        int num1Hundreds = num1 / 100;
        int num1Tens = (num1 % 100) / 10;
        int num1Ones = num1 % 10;

        int num2Hundreds = num2 / 100;
        int num2Tens = (num2 % 100) / 10;
        int num2Ones = num2 % 10;

        System.out.println("Первое число = " + num1);
        System.out.println("Второе число = " + num2);

        if (num1Hundreds == num2Hundreds || num1Tens == num2Tens || num1Ones == num2Ones) {
            if (num1Hundreds == num2Hundreds) {
                System.out.println("\nСотни:\n3-ий разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        num1Hundreds, num2Hundreds);
            }

            if (num1Tens == num2Tens) {
                System.out.println("\nДесятки:\n2-ой разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        num1Tens, num2Tens);
            }

            if (num1Ones == num2Ones) {
                System.out.println("\nЕдиницы:\n1-ый разряд числа");
                System.out.printf("Одинаковые цифры:\n1-е число %d\n2-е число %d\n", 
                        num1Ones, num2Ones);
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
        System.out.println("Сумма вклада: " + deposit);
        float percent = 0.1f;
        if (deposit < 100000) {
            percent = 0.05f;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 0.07f;
        }
        float sum = 0;
        sum = (deposit + deposit * percent);
        System.out.println("Начисленный процент: " + percent);
        System.out.println("Итоговая сумма с %: " + sum);

        System.out.println("\n7.Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgram = 91;
        int historyGrade = 5;
        int programGrade = 5;
        if (percentHistory <= 60) {
            historyGrade = 2;
        } else if (percentHistory > 60 && percentHistory <= 73) {
            historyGrade = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            historyGrade = 4;
        }

        if (percentProgram <= 60) {
            programGrade = 2;
        } else if (percentProgram > 60 && percentProgram <= 73) {
            programGrade = 3;
        } else if (percentProgram > 73 && percentProgram <= 91) {
            programGrade = 4;
        }
        System.out.println("Оценка по Истории: " + historyGrade);
        System.out.println("Оценка по Программированию: " + programGrade);
        System.out.println("Средний балл оценок по предметам: " + (historyGrade + programGrade) / 2);
        System.out.println("Средний % по предметам: " + (percentHistory + percentProgram) / 2);

        System.out.println("\n8.Расчет прибыли за год");
        int monthRent = 5000;
        int middleSell = 13000;
        int costPrice = 9000;
        int income = (middleSell - costPrice - monthRent) * 12;
        char sign = 0;
        if (income > 0)
            sign = '+';
        System.out.println("Прибыль за год: " + sign + income + " руб.");

        System.out.println("\n9.Подсчет количества банкнот");
        int withdrawMoney = 567;
        int hundredsAtm = 4;
        int tensAtm = 7;
        int onesAtm = 100;
        int tensToIssue = 0;
        int onesToIssue = 0;
        int sumAtm = hundredsAtm * 100 + tensAtm * 10 + onesAtm;
        if (withdrawMoney <= sumAtm && withdrawMoney != 0) {
            int hundredsToIssue = 0;
            int withdrawMoneyHundreds = withdrawMoney / 100;
            int withdrawMoneyTens = (withdrawMoney % 100) / 10;
            int withdrawMoneyOnes = withdrawMoney % 10;
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