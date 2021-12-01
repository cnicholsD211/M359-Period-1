package unit_5.in_class.mb;
public class RaceCar {
    // Created by Matt Blake and Mukund Dewan, in Mr. Nichols Period 1 class.
    // This creates a RaceCar object, which can be raced on RaceTracks using the race method.
    // Instance variables
    private DescriptionOfRaceCar description;
    private String name;

    // Full constructor
    public RaceCar(String name, DescriptionOfRaceCar description) {
        this.description = description;
        this.name = name;
    }

    /**
     * This function returns a String using the RaceCar object in an organized fashion.
     * @return Output sentence for the car.
     */
    public String toString(){
        String output = "Name of Driver: " + description.getDriver();
        output += "\nName of Car: " + name;
        output += "\nNumber of Race Car: " + description.getNumber();
        output += "\nFastest Speed Obtained: " + description.getSpeed() + " miles per hour";
        output += "\nDrivers Team: " + description.getTeam();
        output += "\nDebut year: " + description.getYear();
        return output;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DescriptionOfRaceCar getDescription() {
        return description;
    }

    public void setDescription(DescriptionOfRaceCar description) {
        this.description = description;
    }
}
