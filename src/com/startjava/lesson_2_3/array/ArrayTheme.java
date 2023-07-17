package com.startjava.lesson_2_3.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        reverse();
        arrayMultiply();
        arrayErase();
        reversLadder();
        generateNumbers();
    }

    private static void generateNumbers() {
        int[] intArr1 = new int[30];
        for (int i = 0; i < intArr1.length; i++) {
            intArr1[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                while (intArr1[i] == intArr1[j]) {
                    intArr1[i] = (int) (60 + Math.random() * 40);
                    j = 0;
                }
            }
        }
        Arrays.sort(intArr1);
        for (int i = 0; i < intArr1.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(intArr1[i] + " ");
            }
        }
    }

    private static void reversLadder() {
        char[] chars = new char[26];
        int i = 0;
        for (char c = 'Z'; c >= 'A'; c--) {
            chars[i] = c;
            i++;
        }
        int arrLength = chars.length - 1;
        for (i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length - arrLength; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
            arrLength--;
        }
    }

    private static  void arrayErase() {
        float[] floatArr1 = new float[15];
        for (int i = 0; i < floatArr1.length; i++) {
            floatArr1[i] = (float) Math.random();
            outputFormat(floatArr1, i);
        }
        System.out.println("\n");
        float middleNum = floatArr1[floatArr1.length / 2];
        int countZero = 0;
        for (int i = 0; i < floatArr1.length; i++) {
            if (floatArr1[i] > middleNum) {
                floatArr1[i] = 0;
                countZero++;
            }
            outputFormat(floatArr1, i);
        }
        System.out.println("\nКоличество обнуленных ячеек = " + countZero + "\n");
    }

    private static void outputFormat(float[] floatArr1, int i) {
        if (i <= floatArr1.length / 2) {
            System.out.printf("%6.3f", floatArr1[i]);
            if (i == floatArr1.length / 2) {
                System.out.println();
            }
        } else {
            System.out.printf("%6.3f", floatArr1[i]);
        }
    }

    private static void arrayMultiply() {
        int[] intArr1 = new int[10];
        int product = 1;
        for (int i = 0; i < intArr1.length; i++) {
            intArr1[i] = i;
        }
        for (int i = 1; i < intArr1.length - 1; i++) {
            product *= i;
            System.out.print(intArr1[i] < 8 ? intArr1[i] + " * " : intArr1[i] + " = " + product + "\n");
        }
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] == 0 || intArr1[i] == 9) {
                System.out.println("Число: " + intArr1[i] + " его индекс = " + i);
            }
        }
        System.out.println();
    }

    private static void reverse() {
        int[] intArr1 ={1, 4, 6, 7, 2, 3};
        for (int i = intArr1.length - 1; i >= 0; i--) {
            System.out.print(intArr1[i] + " ");
        }
        System.out.println("\n");
    }
}
