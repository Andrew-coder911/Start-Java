class Jaeger {
    private String name;
    private int strenght;
    private int armor;
    private String weapon;

    public Jaeger() {}

    public Jaeger(String name, int strenght, int armor, String weapon) {
        this.name = name;
        this.strenght = strenght;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void printStats() {
        System.out.println("Мои характеристики:");
        System.out.println("Сила: " + strenght);
        System.out.println("Защита: " + armor);
        System.out.println("Оружие: " + weapon);
    }
}