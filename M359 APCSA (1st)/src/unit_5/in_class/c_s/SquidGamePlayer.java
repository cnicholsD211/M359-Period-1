package unit_5.in_class.c_s;

public class SquidGamePlayer {
    private String playerNumber;
    private Skill skill;
    private boolean alive;
    private static int numPlayers = 0;


//setter & getter

    public static void setNumPlayers(int numPlayers) {
        SquidGamePlayer.numPlayers = numPlayers;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public static int getNumPlayers() {
        return numPlayers;
    }

    //Player full constructor
    public SquidGamePlayer(String playerNumber, Skill skill){
        this.playerNumber = playerNumber;
        setSkill(skill);
        alive = true;
        numPlayers += 1;

    }


    /**
     * This method Prints out info of  a player
     * @return player info
     */
    public String toString(){
        String output = "";
        output += "PLAYER: " + playerNumber;
        output += "\n\tSkill Rating:\n";
        output += "\t\tStrength:\t";
        output += getSkill().getStrength();
        output += "\n\t\tKnowledge:\t" + getSkill().getKnowledge();
        return output;
    }


}
