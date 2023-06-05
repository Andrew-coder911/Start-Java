import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока.");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока.");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "";

        do {
            game.play();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            playerAnswer = scan.nextLine();
            while (!playerAnswer.equals("yes") && !playerAnswer.equals("no")) {
                System.out.println("Некорректный ввод. Введите [yes] или [no]");
                playerAnswer = scan.nextLine();
            }
        } while (playerAnswer.equals("yes"));
    }
}