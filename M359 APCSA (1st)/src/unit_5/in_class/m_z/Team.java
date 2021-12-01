package unit_5.in_class.m_z;
// Zach and Miheer
// Mr.Nichols
// Period 1
//takes two players and puts them on one team
public class Team {
    // instance variables
    private String name;
    private Player playerOne;
    private Player playerTwo;


    // full constructor
    public Team(String name, Player playerOne, Player playerTwo) {
        this.name = name;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }


}
