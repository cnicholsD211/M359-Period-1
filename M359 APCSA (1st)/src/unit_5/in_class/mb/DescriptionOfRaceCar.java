package unit_5.in_class.mb;
public class DescriptionOfRaceCar {
    // Created by Matt Blake and Mukund Dewan, in Mr. Nichols Period 1 class.
    // This creates a DescriptionOfRaceCar object, which holds much of the information about the RaceCar it is inside.
    // Instance variables
    private double speed;
    private String driver, team, color;
    private int year, number;

    // Static variables
    private static int nextNumber = 1;

    // Full constructor
    public DescriptionOfRaceCar(double speed, String driver, String color, String team, int year) {
        this.speed = speed;
        this.driver = driver;
        this.team = team;
        this.color = color;
        this.year = year;
        number = nextNumber;
        nextNumber++;
    }

    // Getters and setters


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
