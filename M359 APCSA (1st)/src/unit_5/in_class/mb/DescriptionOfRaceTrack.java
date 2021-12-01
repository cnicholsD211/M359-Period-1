package unit_5.in_class.mb;
public class DescriptionOfRaceTrack {
    // Created by Matt Blake and Mukund Dewan, in Mr. Nichols Period 1 class.
    // This creates a DescriptionOfRaceTrack object, which holds much of the information about the RaceTrack it is inside.
    // Instance variables
    private double length;
    private int numTurns;
    private String location;

    // Full constructor
    public DescriptionOfRaceTrack(double length, int numTurns, String location) {
        this.length = length;
        this.location = location;
        this.numTurns = numTurns;
    }

    // getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumTurns() {
        return numTurns;
    }

    public void setNumTurns(int numTurns) {
        this.numTurns = numTurns;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
