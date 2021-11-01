package unit_5.in_class.marvel;

public class SuperHero {
    // Instance variables
    private String name;
    private Power superPower;
    private int health;

    // Full constructor
    public SuperHero(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        this.health = 1000;
    }

    /**
     * Formally print out a SuperHero Object and its current state
     * @return output of the SuperHero
     */
    public String toString(){
        String output = "";
        output += "Hero's Name:\t\t" + name + "\n";
        output += "Hero's Health:\t\t" + health + "\n";
        output += "Hero's Power:\n";
        output += "\tName:\t\t\t" + superPower.getName() + "\n";
        output += "\tStrength:\t\t" + superPower.getStrength() + "\n";
        return output;
    }

    // Getters and setters
    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
