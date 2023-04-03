class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("\n2.Игра \"Угадай число\"");
        int secretNum = 31;
        int playerNum = 40;
        if (secretNum > 0 && secretNum <= 100) {
            do {
                if (playerNum > secretNum) {
                    System.out.println("Число " + playerNum + " больше того что загадал компьютер");
                    playerNum--;
                } else if (playerNum < secretNum) {
                    System.out.println("Число " + playerNum + " меньше того что загадал компьютер");
                    playerNum++;
                } else {
                    break;
                }
            } while (true);
        }
        System.out.println("Вы победили!");
        System.out.println("Компьютер загадал число: " + playerNum);
    }
}