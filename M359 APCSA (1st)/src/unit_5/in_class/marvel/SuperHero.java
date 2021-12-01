package unit_5.in_class.marvel;

public class SuperHero {
    // Instance variables
    private String name;
    private Power superPower;
    private int health;

    // Static variables
    private static int totalNumSuperHeroes = 0;
    private static int totalHeroHealth = 0;
    private static int totalHeroStrength = 0;

    // Full constructor
    public SuperHero(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        this.health = 1000;
        totalNumSuperHeroes++;
        totalHeroHealth += 1000;
        totalHeroStrength += superPower.getStrength();
    }

    /**
     * Formally print out a SuperHero Object and its current state
     * @return output of the SuperHero
     */
    public String toString(){
        String output = "";
        output += "Hero's Name:\t\t" + name + "\n";
        output += "Hero's Health:\t\t" + health + "\n";
        output += "Total # Heroes:\t\t" + totalNumSuperHeroes + "\n";
        output += "Hero's Power:\n";
        output += "\tName:\t\t\t" + superPower.getName() + "\n";
        output += "\tStrength:\t\t" + superPower.getStrength() + "\n";
        return output;
    }

    public static void getAvgStrength(){
        double avg = (double) totalHeroStrength / totalNumSuperHeroes;
        System.out.println("Average Strength:" + avg);
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

    public static int getTotalNumSuperHeroes() {
        return totalNumSuperHeroes;
    }

    public static void setTotalNumSuperHeroes(int totalNumSuperHeroes) {
        SuperHero.totalNumSuperHeroes = totalNumSuperHeroes;
    }

    public static int getTotalHeroHealth() {
        return totalHeroHealth;
    }

    public static void setTotalHeroHealth(int totalHeroHealth) {
        SuperHero.totalHeroHealth = totalHeroHealth;
    }

    public static int getTotalHeroStrength() {
        return totalHeroStrength;
    }

    public static void setTotalHeroStrength(int totalHeroStrength) {
        SuperHero.totalHeroStrength = totalHeroStrength;
    }
}
