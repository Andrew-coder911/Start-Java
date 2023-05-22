import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessPlay() {
        Player currentPlayer = player1;
        int secretNumber = GenerateSecretNumber();
        Scanner scan = new Scanner(System.in);

        while (currentPlayer.getNumber() != secretNumber) {
            System.out.println("Игрок: " + currentPlayer.getName() + " загадайте число");
            currentPlayer.setNumber(scan.nextInt());
            System.out.println("Загадал число " + currentPlayer.getNumber());

            if(currentPlayer.getNumber() > secretNumber) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        "больше того, что загадал компьютер");
            } else if(currentPlayer.getNumber() < secretNumber) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        "меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали.");
            }
            currentPlayer = player2;
            player1 = player2;
            currentPlayer = player1;
        }
    }

    public int GenerateSecretNumber() {
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        return secretNumber;
    }
}