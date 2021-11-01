package unit_5.in_class.marvel;

public class Power {
    // Instance variables
    private String name;
    private int strength;

    // Full constructor
    public Power(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
