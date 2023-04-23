import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer = "";
        boolean countinuing;
        Scanner scan = new Scanner(System.in);
        do {
            Calculator calculator = new Calculator();
            countinuing = false;

            System.out.println("Ведите первое число:");
            calculator.setNum1(scan.nextInt());
            System.out.println("Введите знак математической операции:");
            scan.nextLine();
            calculator.setSign(scan.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setNum2(scan.nextInt());

            System.out.println(calculator.getNum1() + " " + calculator.getSign() + " " + 
                    calculator.getNum2() + " = " + calculator.calculate());
            scan.nextLine();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userAnswer = scan.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.println("Некорректный ввод. Введите [yes] или [no]");
                userAnswer = scan.nextLine();
            }
            if (userAnswer.equals("no")) {
                    break;
            }
        } while (userAnswer.equals("yes"));
    }
}