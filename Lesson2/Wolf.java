public class Wolf {
    String male;
    String nickname;
    String color;
    int weight;
    int age;

    // public Wolf(String male, String nickname, String color, int weight, int age) {
    //     this.male = male;
    //     this.nickname = nickname;
    //     this.color = color;
    //     this.weight = weight;
    //     this.age = age;
    // }

    public void walking() {
        System.out.println("Идет");
    }

    public void sitting() {
        System.out.println("Сидит");
    }

    public void running() {
        System.out.println("Бежит");
    }

    public void howls() {
        System.out.println("Воет");
    }

    public void hunting() {
        System.out.println("Охотится");
    }
}