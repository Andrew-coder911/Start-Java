import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;
        boolean countinuing;
        do {
            Calculator calculator = new Calculator();
            Scanner scan = new Scanner(System.in);
            countinuing = false;

            System.out.println("Ведите первое число:");
            calculator.setNum1(scan.nextInt());
            System.out.println("Введите знак математической операции:");
            scan.nextLine();
            calculator.setSign(scan.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setNum2(scan.nextInt());

            calculator.setResult(calculator.getSign(), calculator.getNum1(), calculator.getNum2());
            System.out.println(calculator.getNum1() + " " + calculator.getSign() + " " + 
                    calculator.getNum2() + " = " + calculator.getResult());
            scan.nextLine();
            while (!countinuing) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scan.nextLine();
                if (userAnswer.equals("yes")) {
                    countinuing = true;
                    continue;
                } else if (userAnswer.equals("no")) {
                    countinuing = false;
                    break;
                } else {
                    System.out.println("Некорректный ввод. Введите [yes] или [no]");
                }
            }
        } while (countinuing);
    }
}