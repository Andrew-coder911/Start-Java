package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player2;
        int secretNumber = generateSecretNumber();
        Scanner scan = new Scanner(System.in);

        while (currentPlayer.getNumber() != secretNumber) {
            if (currentPlayer == player2) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            System.out.println("Игрок: " + currentPlayer.getName() + " загадайте число");
            currentPlayer.setNumber(scan.nextInt());
            System.out.println("Загадал число " + currentPlayer.getNumber());

            if(currentPlayer.getNumber() > secretNumber) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " больше того, что загадал компьютер");
            } else if(currentPlayer.getNumber() < secretNumber) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали.");
            }
        }
    }

    public int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}