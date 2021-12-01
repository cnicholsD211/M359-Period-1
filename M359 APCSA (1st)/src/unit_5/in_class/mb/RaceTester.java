package unit_5.in_class.mb;
public class RaceTester {
    public static void main(String[] args) {
        // Created by Matt Blake and Mukund Dewan, in Mr. Nichols Period 1 class.
        // RaceCars
        RaceCar car1 = new RaceCar("King", new DescriptionOfRaceCar(220, "Marty Dallas", "Blue", "Dinaco", 2019));
        RaceCar car2 = new RaceCar("Storm", new DescriptionOfRaceCar(230, "Jack Houston", "Black", "None", 2020));
        RaceCar car3 = new RaceCar("McQueen", new DescriptionOfRaceCar(230, "Joey Dallas", "Red", "Rust-eze", 2015));
        RaceCar car4 = new RaceCar("Mater", new DescriptionOfRaceCar(150, "John Dallas", "Brown", "None", 1985));

        // RaceTracks
        RaceTrack track1 = new RaceTrack("Daytona", new DescriptionOfRaceTrack(1.5, 4, "Florida"));
        RaceTrack track2 = new RaceTrack("Indy 500", new DescriptionOfRaceTrack(0.3, 4, "Indiana"));

        // Print Statements
        System.out.println(car1);
        System.out.println("\n" + car2);
        System.out.println("\n" + car3);
        System.out.println("\n" + car4);
        System.out.println("\n" + track1);
        System.out.println("\n" + track2);

        setDefault(car4);
        System.out.println("\n" + car4);

        // Races
        RaceCar winningCar = track1.race(100, car1, car2);
        System.out.println(winningText(winningCar));
        winningCar = track2.race(500, car2, car3);
        System.out.println(winningText(winningCar));
    }
    /**
     * This function returns a String using the RaceCar object to create a String for the winner of this race.
     * @param car - The car that won.
     * @return Output sentence for the car.
     */
    public static String winningText(RaceCar car) {
        if(car.getDescription().getTeam().equals("None"))
            return "And the winner of this race is " + car.getName() + ", driven by " + car.getDescription().getDriver() + ".";
        else
            return "And the winner of this race is " + car.getName() + ", driven by " + car.getDescription().getDriver() + " for the team " + car.getDescription().getTeam() + ".";
    }
    /**
     * This function edits a car to have default settings.
     * @param car - The car that will be set to default.
     */
    public static void setDefault(RaceCar car) {
        car.setName("Doe");
        car.getDescription().setColor("White");
        car.getDescription().setDriver("John Doe");
        car.getDescription().setSpeed(200);
        car.getDescription().setTeam("None");
        car.getDescription().setYear(2010);
    }
}
