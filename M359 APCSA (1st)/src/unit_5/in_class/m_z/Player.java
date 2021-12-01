package unit_5.in_class.m_z;
// Zach and Miheer
// Mr.Nichols
// Period 1
// This class creates a player that has a name and utilizes the Stats class to the get the players stats
public class Player {
    // instance variables
    private String name;
    private Stats playerStats;

    // static variables
    private static double totalOffRating = 0;
    private static double totalDefRating = 0;
    private static int totalNumPlayers = 0;


    // full constructor
    public Player(String name, Stats playerStats) {
        this.name = name;
        this.playerStats = playerStats;
        totalOffRating += playerStats.getOffRating();
        totalDefRating += playerStats.getDefRating();
        totalNumPlayers++;
    }

    // static methods
    /**
     * This method prints out the average offensive rating of all players
     */
    public static void calcAvgOffRating(){
        double avg = (double) totalOffRating / totalNumPlayers;
        System.out.println("Average Offensive Rating: " + avg);
    }

    /**
     * This method prints out the average defensive rating of all players
     */
    public static void calAvgDefRating(){
        double avg = (double) totalDefRating / totalNumPlayers;
        System.out.println("Average Defensive Rating: " + avg);
    }



    // getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Stats getPlayerStats()
    {
        return playerStats;
    }

    public void setPlayerStats(Stats playerStats)
    {
        this.playerStats = playerStats;
    }

    public static double getTotalOffRating() {
        return totalOffRating;
    }

    public static void setTotalOffRating(double totalOffRating) {
        Player.totalOffRating = totalOffRating;
    }

    public static double getTotalDefRating() {
        return totalDefRating;
    }

    public static void setTotalDefRating(double totalDefRating) {
        Player.totalDefRating = totalDefRating;
    }

    public static int getTotalNumPlayers() {
        return totalNumPlayers;
    }

    public static void setTotalNumPlayers(int totalNumPlayers) {
        Player.totalNumPlayers = totalNumPlayers;
    }
}
