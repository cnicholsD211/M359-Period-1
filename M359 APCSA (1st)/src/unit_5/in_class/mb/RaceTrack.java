package unit_5.in_class.mb;
public class RaceTrack {
    // Created by Matt Blake and Mukund Dewan, in Mr. Nichols Period 1 class.
    // This creates a RaceTrack object for RaceCars to race on using the race method.
    // Instance variables
    private DescriptionOfRaceTrack description;
    private String name;

    // Static variables
    private static boolean isRaining = false;
    final private static double MPH_TO_FPS = 1.46666;
    final private static int M_TO_F = 5280;

    // Full constructor
    public RaceTrack(String name, DescriptionOfRaceTrack description) {
        this.description = description;
        this.name = name;
    }

    /**
     * This function returns a String using the RaceTrack object in an organized fashion.
     * @return Output sentence for the house
     */
    public String toString(){
        String output = "Name of Race Track: " + name;
        output += "\nLocation of Race Track: " + description.getLocation();
        output += "\nLength of Race Track: " + description.getLength() + " miles";
        output += "\nNumber of Turns: " + description.getNumTurns();
        return output;
    }

    /**
     * This function returns the winning RaceCar by having two racers compete on a RaceTrack, whoever finishes first wins.
     * @param laps - the number of laps that occur
     * @param car1 - the first car raced
     * @param car2 - the second car raced
     * @return the winning car
     */
    public RaceCar race(int laps, RaceCar car1, RaceCar car2) {
        int lapsCar1Completed = 0;
        int lapsCar2Completed = 0;
        int distanceCar1Covered = 0;
        int distanceCar2Covered = 0;
        RaceCar winningCar = null;
        while(winningCar==null) {
            if(isRaining) {
                int distanceCar1Traveled = (int)(0.8*car1.getDescription().getSpeed()*MPH_TO_FPS + 0.1*car1.getDescription().getSpeed()*Math.random()*MPH_TO_FPS);
                int distanceCar2Traveled = (int)(0.8*car2.getDescription().getSpeed()*MPH_TO_FPS + 0.1*car2.getDescription().getSpeed()*Math.random()*MPH_TO_FPS);
                distanceCar1Covered += distanceCar1Traveled;
                distanceCar2Covered += distanceCar2Traveled;
            } else {
                int distanceCar1Traveled = (int)(0.9*car1.getDescription().getSpeed()*MPH_TO_FPS + 0.1*car1.getDescription().getSpeed()*Math.random()*MPH_TO_FPS);
                int distanceCar2Traveled = (int)(0.9*car2.getDescription().getSpeed()*MPH_TO_FPS + 0.1*car2.getDescription().getSpeed()*Math.random()*MPH_TO_FPS);
                distanceCar1Covered += distanceCar1Traveled;
                distanceCar2Covered += distanceCar2Traveled;
            }
            System.out.println(car1.getName() + " has travelled " + distanceCar1Covered + " feet and " + lapsCar1Completed + " laps so far, while " + car2.getName() + " has travelled " + distanceCar2Covered + " feet and completed " + lapsCar2Completed + " laps so far.");
            while(distanceCar1Covered>=description.getLength()*M_TO_F) {
                distanceCar1Covered-=description.getLength()*M_TO_F;
                lapsCar1Completed++;
            }
            while(distanceCar2Covered>=description.getLength()*M_TO_F) {
                distanceCar2Covered-=description.getLength()*M_TO_F;
                lapsCar2Completed++;
            }
            if(lapsCar2Completed >= laps) {
                winningCar = car2;
            }
            if(lapsCar1Completed >= laps) {
                winningCar = car1;
            }
            if(Math.random()<0.001) {
                updateWeather();
            }
        }
        return winningCar;
    }

    /**
     * This function updates the weather from raining to not raining and vice versa.
     */
    public static void updateWeather() {
        isRaining = !isRaining;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DescriptionOfRaceTrack getDescription() {
        return description;
    }

    public void setDescription(DescriptionOfRaceTrack description) {
        this.description = description;
    }
}
