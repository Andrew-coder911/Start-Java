public class IfElseStatementTheme{

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 31;
        if(age > 20){
            System.out.println("Тебе больше 20!");
        }else{
            System.out.println("Тебе меньше 20!");
        }

        boolean male = true;
        if (!male) {
            System.out.println("Ты женщина!");
        }else{
            System.out.println("Ты мужчина!");
        }

        float height = 1.83f;
        if (height < 1.80f) {
            System.out.println("Ты не высок.");
        }else{
            System.out.println("Ты достаточно высокий.");
        }

        String nameFirstLetter = "Andrew";
        if(nameFirstLetter.charAt(0) == 'M'){
            System.out.println("Ты не Андрей");
        }else if(nameFirstLetter.charAt(0) == 'I'){
            System.out.println("Все еще не Андрей");
        }else{
            System.out.println("Возможно что тебя зовут Андрей)\n");
        }

        System.out.println("2.Поиск max и min числа");
        int numOne = 70;
        int numTwo = 70;
        System.out.printf("Первое число - %d \nВторое число - %d\n", numOne, numTwo);
        if (numOne > numTwo) {
            System.out.printf("Число %d - max\n", numOne);
            System.out.printf("Число %d - min\n", numTwo);
        }else if (numOne < numTwo) {
            System.out.printf("Число %d - min\n", numOne);
            System.out.printf("Число %d - max\n", numTwo);
        }else{
            System.out.println("Оба числа равны");
        }

        System.out.println("\n3.Проверка числа");
        int num = 10;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " - четное.");
            }else{
                System.out.println("Число " + num + " - нечетное.");
            }
        }else{
            System.out.println("Число " + num + " - ноль.");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        numOne = 123;
        numTwo = 123;
        int numOneHundreds = numOne / 100;
        int numOneTens = (numOne % 100) / 10;
        int numOneOnes = numOne % 10;

        int numTwoHundreds = numTwo / 100;
        int numTwoTens = (numTwo % 100) / 10;
        int numTwoOnes = numTwo % 10;

        System.out.println("Первое число = " + numOne);
        System.out.println("Второе число = " + numTwo);

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
        }else{
            System.out.println("Все цифры в разрядах разные.");
        }

        System.out.println("\n5. Определение символа по его коду");
        char sumbol = '\u0057';
        System.out.println("Символ - " + sumbol);
        if (sumbol >= '1' && sumbol <= '9') {
            System.out.println("Это число.");
        }else if (sumbol >= 'a' && sumbol <= 'z') {
            System.out.println("Это маленькая буква.");
        }else if (sumbol >= 'A' && sumbol <= 'Z') {
            System.out.println("Это большая буква.");
        }else {
            System.out.println("Это не буква и не число.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int sum = 0;
        int percent = 0;
        System.out.println("Сумма вклада: " + deposit);
        if (deposit < 100000) {
            sum = (int) (deposit + deposit * 0.05f);
            percent = sum - deposit;
        }else if (deposit >= 100000 && deposit <= 300000) {
            sum = (int) (deposit + deposit * 0.07f);
            percent = sum - deposit;
        }else if (deposit > 300000) {
            sum = (int) (deposit + deposit * 0.1f);
            percent = sum - deposit;
        }
        System.out.println("Начисленный процент: " + percent);
        System.out.println("Итоговая сумма с %: " + sum);

        System.out.println("\n7.Определение оценки по предметам");
        int gradeHistory = 59;
        int gradeProgram = 91;
        int gradeOne = 0;
        int gradeTwo = 0;
        if (gradeHistory <= 60) {
            System.out.println("Оценка: 2 - История");
            gradeOne = 2;
        }else if (gradeHistory > 60 && gradeHistory <= 73) {
            System.out.println("Оценка: 3 - История");
            gradeOne = 3;
        }else if (gradeHistory > 73 && gradeHistory <= 91) {
            System.out.println("Оценка: 4 - История");
            gradeOne = 4;
        }else if (gradeHistory > 91) {
            System.out.println("Оценка: 5 - История");
            gradeOne = 5;
        }
        if (gradeProgram <= 60) {
            System.out.println("Оценка: 2 - Программирование");
            gradeTwo = 2;
        }else if (gradeProgram > 60 && gradeProgram <= 73) {
            System.out.println("Оценка: 3 - Программирование");
            gradeTwo = 3;
        }else if (gradeProgram > 73 && gradeProgram <= 91) {
            System.out.println("Оценка: 4 - Программирование");
            gradeTwo = 4;
        }else if (gradeProgram > 91) {
            System.out.println("Оценка: 5 - Программирование");
            gradeTwo = 5;
        }
        System.out.println("Средний балл оценок по предметам: " + (gradeOne + gradeTwo) / 2);
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
        if(withdrawMoney <= sumAtm && withdrawMoney != 0){
            if (withdrawMoneyHundreds <= hundredsAtm) {
                hundredsToIssue = withdrawMoneyHundreds;
            }else{
                hundredsToIssue = hundredsAtm;
                hundredsAtm = (hundredsAtm - withdrawMoneyHundreds) * 10;
                withdrawMoneyTens -= hundredsAtm;
            }
            if (withdrawMoneyTens <= tensAtm) {
                tensToIssue = withdrawMoneyTens;
            }else{
                tensToIssue = tensAtm;
                tensAtm = tensAtm - withdrawMoneyTens;
                withdrawMoneyOnes = withdrawMoneyOnes - (tensAtm * 10);
                System.out.println("Это здесь" + withdrawMoneyOnes);
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
        }else{
            System.out.println("В банкомате не достаточно денег или запрошена некорректная сумма");
        }
    }
}