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
        int numOne = 10;
        int numTwo = 5;
        int numThree = -1;
        int max = 0;
        int min = 0;
        if (numOne > numTwo && numOne > numThree) {
            max = numOne;
        }else if (numTwo > numOne && numTwo > numThree) {
            max = numTwo;
        }else{
            max = numThree;
        }
        if (numOne < numTwo && numOne < numThree) {
            min = numOne;
        }else if (numTwo < numOne && numTwo < numThree) {
            min = numTwo;
        }else{
            min = numThree;
        }
        for (int i = ++min; i < max; i++) {
            System.out.printf("%d", i);
        }
    }
}