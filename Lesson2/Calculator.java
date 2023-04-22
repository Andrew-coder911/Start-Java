class Calculator {
    private int num1;
    private int num2;
    private char sign;
    private int result;
    private String userAnswer;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void setResult(char sign, int num1, int num2) {
        switch (sign) {
        case '+':
            this.result = num1 + num2;
            break;
        case '-':
            this.result = num1 - num2;
            break;
        case '*':
            this.result = num1 * num2;
            break;
        case '/':
            this.result = num1 / num2;
            break;
        case '^':
            result = 1;
            for (int i = 0; i < num2; i++) {
                this.result *= num1;
            }
            break;
        case '%':
            this.result = num1 % num2;
            break;
        default:
            System.out.println("Введенная математическая операция не поддерживается.");
        }
    }

    public int getResult() {
        return result;
    }
}