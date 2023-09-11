package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplyArray();
        eraseArray();
        printAlphabetWithStairs();
        addUniqueNumbersToArray();
    }

    private static void reverseArray() {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {1, 4, 6, 7, 2, 3, 5};
        int length = numbers.length;
        System.out.println("   До реверса: " + Arrays.toString(numbers));
        for (int i = 0; i < length / 2; i++) {
            int swap = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = swap;
        }
        System.out.println("После реверса: " + Arrays.toString(numbers));
    }

    private static void multiplyArray() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= i;
            System.out.print(multipliers[i]);
            System.out.print(multipliers[i] < length - 2 ? " * " : " = " + product + "\n");
        }
        System.out.println("Число: " + multipliers[0] + " его индекс = " + 0);
        System.out.println("Число: " + multipliers[length - 1] + " его индекс = " + (length - 1));
    }

    private static void eraseArray() {
        System.out.println("\n3. Удаление элементов массива");
        float[] randomNumbers = new float[15];
        int length = randomNumbers.length;
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = (float) Math.random();
        }
        outputFormat(randomNumbers, length);
        System.out.println("\n");
        float middleCellValue = randomNumbers[length / 2];
        int countZero = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > middleCellValue) {
                randomNumbers[i] = 0;
                countZero++;
            }
        }
        outputFormat(randomNumbers, length);
        System.out.println("\nКоличество обнуленных ячеек = " + countZero + "\n");
    }

    private static void outputFormat(float[] randomNumbers, int length) {
        for (int i = 0; i < length; i++) {
            if (i <= length / 2) {
                System.out.printf("%6.3f", randomNumbers[i]);
                if (i == length / 2) {
                    System.out.println();
                }
            } else {
                System.out.printf("%6.3f", randomNumbers[i]);
            }
        }
    }

    private static void printAlphabetWithStairs() {
        System.out.println("4. Вывод элементов массива лесенкой");
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int arrayLength = alphabet.length - 1;
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - arrayLength; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
            arrayLength--;
        }
    }

    private static void addUniqueNumbersToArray() {
        System.out.print("\n5. Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        boolean finded = true;
        uniqueNumbers[0] = (int) (60 + Math.random() * 40);
        for (int i = 1; i < length; i++) {
            int uniqueNumber = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                if (uniqueNumber == uniqueNumbers[j]) {
                    i--;
                    finded = false;
                    break;
                } else {
                    finded = true;
                }
            }
            if (finded) {
                uniqueNumbers[i] = uniqueNumber;
            }
        }
        Arrays.sort(uniqueNumbers);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(uniqueNumbers[i] + " ");
            }
        }
    }
}
