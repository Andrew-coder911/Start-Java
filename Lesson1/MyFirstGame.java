class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("\n2.Игра \"Угадай число\"");
        int compNum = 31;
        int personNum = 40;
        boolean correct = true;
        if (compNum > 0 && compNum <= 100) {
            do {
                if (personNum > compNum) {
                    System.out.println("Число " + personNum + " больше того что загадал компьютер");
                    personNum--;
                } else if (personNum < compNum) {
                    System.out.println("Число " + personNum + " меньше того что загадал компьютер");
                    personNum++;
                }else if (personNum == compNum) {
                    System.out.println("Вы победили!");
                    System.out.println("Компьютер загадал число: " + personNum);
                    correct = false;
                }
            } while (correct);
        }
    }
}