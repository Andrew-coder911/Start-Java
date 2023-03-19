class CyclesTheme{

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int pointA = -10;
        int pointB = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do{
            if(pointA % 2 == 0){
                sumEven += pointA;
            }else{
                sumOdd += pointA;
            }
            pointA++;
        }while(pointA <= pointB);
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
        }else if (num2 > num1 && num2 > num3) {
            max = num2;
        }else{
            max = num3;
        }
        if (num1 < num2 && num1 < num3) {
            min = num1;
        }else if (num2 < num1 && num2 < num3) {
            min = num2;
        }else{
            min = num3;
        }
        System.out.printf("Числа в интервале (%d, %d) в порядке убывания\n", min, max);
        for (int i = --max; i > min; i--) {
            System.out.printf("%d", i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int num1Thousands
        int num1Hundreds;
        int num1Tens;
        int num1Ones;
        while (num1 % 10 != num1Ones){
            
        }
    }
}