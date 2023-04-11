public class Wolf {
    private String male;
    private String nickname;
    private String color;
    private int weight;
    private int age;

    public void setMale(String male) {
        this.male = male;
    }

    public String getMale() {
        return male;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("Некорректный вес.");
        } else {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст.");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}