package Entity;

public class Hero extends Human{

    private String name;
    private int age;
    private int hp ;
    private final String job = "勇者";

    public Hero(String name,int age,int hp){

        this.name =  name;
        this.age = age;
        this.hp = hp;

    }

    public Hero(){}

    public void attack_with_fist(Human human){

        human.setDamage(2);

    }

    public void attack_with_sword(Human human){

        human.setDamage(20);

    }
}
