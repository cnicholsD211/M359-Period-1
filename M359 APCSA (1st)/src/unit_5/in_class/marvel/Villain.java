package unit_5.in_class.marvel;

public class Villain {
    // Instance variables
    private String name;
    private Power superPower;
    private int health;

    // Full constructor
    public Villain(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        this.health = 1000;
    }

    /**
     * Formally print out a Villain Object and its current state
     * @return output of the Villain
     */
    public String toString(){
        String output = "";
        output += "Villain's Name:\t\t" + name + "\n";
        output += "Villain's Health:\t" + health + "\n";
        output += "Villain's Power:\n";
        output += "\tName:\t\t\t" + superPower.getName() + "\n";
        output += "\tStrength:\t\t" + superPower.getStrength() + "\n";
        return output;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
