package Entity;

public class Human {

    private String name;
    private int age;
    private int hp = 100;
    private String job;

    public Human(String name, int age, String job, int hp){

        this.name =  name;
        this.age = age;
        this.job = job;
        this.hp = hp;

    }

    public Human(){}

    //Functions
    public String getName() { return this.name; }

    public int getHp() { return this.hp; }

    public void setHp(int hp) { this.hp = hp; }

    public void setDamage(int damage){ this.hp = getHp() - (damage); }


    public void walk(){
        System.out.println("歩いた！");
    }
    public void sleep(){

        if (this.getHp() != 100){

            String message = this.getName() + "は" + (100 - this.getHp()) + "HPが回復した";

            setHp(100);
            System.out.println(message);
        }
    }
    public void eat(){ System.out.println("食べた"); }

}
