import Entity.Hero;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("大剣の勇者",18,160);
        Hero hero1 = new Hero("弓の勇者",18,120);

        hero.attack_with_fist(hero1);
        System.out.println(hero1.getHp());

        hero1.sleep();
        System.out.println(hero1.getHp());
        System.out.println(hero.getName());
        System.out.println(hero1.getName());
    }
}
