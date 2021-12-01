package unit_5.in_class.c_s;

public class Skill {
    private String name;
    private int strength;
    private int knowledge;


    //getter and setter
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Constructors for 4 different types of skilled options
    public Skill(String name, boolean strength, boolean knowledge){
        this.knowledge = (int) (Math.random() * 50 + 50);
        this.strength = (int) (Math.random() * 50 + 50);
        this.name = name;

    }
    public Skill(String name, boolean knowledge){
        this.knowledge = (int) (Math.random() * 50 + 50);
        this.strength = (int) (Math.random() * 50 + 1);
        this.name = name;
    }
    public Skill(boolean strength, String name){
        this.knowledge = (int) (Math.random() * 50 + 1);
        this.strength = (int) (Math.random() * 50 + 50);
        this.name = name;
    }
    public Skill(String name){
        this.knowledge = (int) (Math.random() * 50 + 1);
        this.strength = (int) (Math.random() * 50 + 1);
        this.name = name;
    }


}
