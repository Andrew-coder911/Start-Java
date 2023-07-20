package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        turnOver();
        System.out.println("\n2. Вывод произведения элементов массива");
        multiplyArray();
        System.out.println("\n3. Удаление элементов массива");
        arrayErase();
        System.out.println("4. Вывод элементов массива лесенкой");
        reversLadder();
        System.out.println("\n5. Заполнение массива уникальными числами");
        generateNumbers();
    }

    private static void turnOver() {
        int[] numbers = {1, 4, 6, 7, 2, 3, 5};
        int length = numbers.length;
        System.out.println("   До реверса: " + Arrays.toString(numbers));
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            int number = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = number;
        }
        System.out.println("После реверса: " + Arrays.toString(numbers));
    }

    private static void multiplyArray() {
        int[] numbers = new int[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= i;
            System.out.print(numbers[i]);
            System.out.print(numbers[i] < length - 2 ? " * " : " = " + product + "\n");
        }
        System.out.println("Число: " + numbers[0] + " его индекс = " + 0);
        System.out.println("Число: " + numbers[length - 1] + " его индекс = " + (length - 1));
    }

    private static  void arrayErase() {
        float[] floatNumbers = new float[15];
        int length = floatNumbers.length;
        for (int i = 0; i < length; i++) {
            floatNumbers[i] = (float) Math.random();
            outputFormat(floatNumbers, i, length);
        }
        System.out.println("\n");
        float middleNum = floatNumbers[length / 2];
        int countZero = 0;
        for (int i = 0; i < length; i++) {
            if (floatNumbers[i] > middleNum) {
                floatNumbers[i] = 0;
                countZero++;
            }
            outputFormat(floatNumbers, i, length);
        }
        System.out.println("\nКоличество обнуленных ячеек = " + countZero + "\n");
    }

    private static void outputFormat(float[] floatNumbers, int i, int length) {
        if (i <= length / 2) {
            System.out.printf("%6.3f", floatNumbers[i]);
            if (i == length / 2) {
                System.out.println();
            }
        } else {
            System.out.printf("%6.3f", floatNumbers[i]);
        }
    }

    private static void reversLadder() {
        char[] chars = new char[26];
        int i = 0;
        for (char c = 'Z'; c >= 'A'; c--) {
            chars[i] = c;
            i++;
        }
        int arrayLength = chars.length - 1;
        int length = chars.length;
        for (i = 0; i < length; i++) {
            for (int j = 0; j < length - arrayLength; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
            arrayLength--;
        }
    }

    private static void generateNumbers() {
        int[] numbers = new int[30];
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                while (numbers[i] == numbers[j]) {
                    numbers[i] = (int) (60 + Math.random() * 40);
                    j = 0;
                }
            }
        }
        Arrays.sort(numbers);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
