import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока.");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока.");
        scan.nextLine();
        Player player2 = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.guessPlay();

        // System.out.println("1:" + player1.getName() + " " + player1.getName());
        // System.out.println("2:" + player2.getName() + " " + player2.getName());
    }
}