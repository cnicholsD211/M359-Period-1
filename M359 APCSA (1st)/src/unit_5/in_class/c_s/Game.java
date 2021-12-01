package unit_5.in_class.c_s;

public class Game {
    private String name;
    private boolean strength;
    private boolean knowledge;
    private static int gameNumber = 1;
    private int playersLost;
    private static SquidGamePlayer a;
    private static SquidGamePlayer b;
    private static SquidGamePlayer c;
    private static SquidGamePlayer d;
    private static SquidGamePlayer e;
    private static SquidGamePlayer f;
    private static SquidGamePlayer g;
    private static SquidGamePlayer h;
    private static SquidGamePlayer i;
    private static SquidGamePlayer j;


    //getters and setters
    public int getPlayersLost() {
        return playersLost;
    }

    public void setPlayersLost(int playersLost) {
        this.playersLost = playersLost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStrength() {
        return strength;
    }

    public void setStrength(boolean strength) {
        this.strength = strength;
    }

    public boolean isKnowledge() {
        return knowledge;
    }

    public void setKnowledge(boolean knowledge) {
        this.knowledge = knowledge;
    }

    //full game constructor
    public Game(String name, boolean strength, boolean knowledge, int playersLost,SquidGamePlayer a, SquidGamePlayer b, SquidGamePlayer c, SquidGamePlayer d, SquidGamePlayer e, SquidGamePlayer f, SquidGamePlayer g, SquidGamePlayer h, SquidGamePlayer i, SquidGamePlayer j) {
        this.knowledge = knowledge;
        this.strength = strength;
        this.name = name;

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;


        this.playersLost = playersLost;

    }

    public Game(String name, boolean strength, boolean knowledge, int playersLost) {
        this.knowledge = knowledge;
        this.strength = strength;
        this.name = name;


        this.playersLost = playersLost;

    }

    /**
     * This method calculates the game number
     * @param game what game is this game number
     */

    public static void calcGameNumber(Game game){
        System.out.println();
        if (gameNumber == 4) {
            System.out.println("The Fourth Game: " + game.getName());
            gameNumber++;
        }
        if (gameNumber == 3) {
            System.out.println("The Third Game: " + game.getName());
            gameNumber++;
        }
        if (gameNumber == 2) {
            System.out.println("The Second Game: " + game.getName());
            gameNumber++;
        }
        if (gameNumber == 1) {
            System.out.println("The First Game: " + game.getName());
            gameNumber++;
        }
    }

    /**
     * This method runs a game
     * @param game game being played
     */

    public static void playGame(Game game) {
        System.out.println();
        int playersLost = 0;

        System.out.println("Players Remaining:\t" + SquidGamePlayer.getNumPlayers());
        System.out.println(calcPlayerList(game));
        if (game.isStrength() == true && game.isKnowledge() == false) {
            System.out.println("\nPlayers Lost:");

            while (playersLost < game.playersLost) {
                if (a.isAlive() == true && playersLost < game.playersLost) {
                    if (a.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        a.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + a.getPlayerNumber() + " lost");
                    }
                }
                if (b.isAlive() == true && playersLost < game.playersLost) {
                    if (b.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        b.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + b.getPlayerNumber() + " lost");
                    }
                }
                if (c.isAlive() == true && playersLost < game.playersLost) {
                    if (c.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        c.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + c.getPlayerNumber() + " lost");
                    }
                }
                if (d.isAlive() == true && playersLost < game.playersLost) {
                    if (d.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        d.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + d.getPlayerNumber() + " lost");
                    }

                }
                if (e.isAlive() == true && playersLost < game.playersLost) {
                    if (e.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        e.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + e.getPlayerNumber() + " lost");
                    }
                }
                if (f.isAlive() == true && playersLost < game.playersLost) {
                    if (f.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        f.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + f.getPlayerNumber() + " lost");
                    }
                }
                if (g.isAlive() == true && playersLost < game.playersLost) {
                    if (g.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        g.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + g.getPlayerNumber() + " lost");
                    }
                }
                if (h.isAlive() == true && playersLost < game.playersLost) {
                    if (h.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        h.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + h.getPlayerNumber() + " lost");
                    }
                }
                if (i.isAlive() == true && playersLost < game.playersLost) {
                    if (i.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        i.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + i.getPlayerNumber() + " lost");
                    }
                }
                if (j.isAlive() == true && playersLost < game.playersLost) {
                    if (j.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 100) {
                        j.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + j.getPlayerNumber() + " lost");
                    }
                }
            }
        }
        if (game.isStrength() == false && game.isKnowledge() == true) {
            playersLost = 0;
            System.out.println("\nPlayers Lost:");
            while (playersLost < game.playersLost) {
                if (a.isAlive() == true && playersLost < game.playersLost) {
                    if (a.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        a.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + a.getPlayerNumber() + " lost");
                    }
                }
                if (b.isAlive() == true && playersLost < game.playersLost) {
                    if (b.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        b.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + b.getPlayerNumber() + " lost");
                    }
                }
                if (c.isAlive() == true && playersLost < game.playersLost) {
                    if (c.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        c.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + c.getPlayerNumber() + " lost");
                    }
                }
                if (d.isAlive() == true && playersLost < game.playersLost) {
                    if (d.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        d.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + d.getPlayerNumber() + " lost");
                    }

                }
                if (e.isAlive() == true && playersLost < game.playersLost) {
                    if (e.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        e.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + e.getPlayerNumber() + " lost");
                    }
                }
                if (f.isAlive() == true && playersLost < game.playersLost) {
                    if (f.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        f.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + f.getPlayerNumber() + " lost");
                    }
                }
                if (g.isAlive() == true && playersLost < game.playersLost) {
                    if (g.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        g.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + g.getPlayerNumber() + " lost");
                    }
                }
                if (h.isAlive() == true && playersLost < game.playersLost) {
                    if (h.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        h.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + h.getPlayerNumber() + " lost");
                    }
                }
                if (i.isAlive() == true && playersLost < game.playersLost) {
                    if (i.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        i.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + i.getPlayerNumber() + " lost");
                    }
                }
                if (j.isAlive() == true && playersLost < game.playersLost) {
                    if (j.getSkill().getKnowledge() + (int) (Math.random() * 100 + 1) <= 100) {
                        j.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + j.getPlayerNumber() + " lost");
                    }
                }
            }
        }
        if (game.isStrength() == true && game.isKnowledge() == true) {
            playersLost = 0;
            System.out.println("\nPlayers Lost:");
            while (playersLost < game.playersLost) {
                if (a.isAlive() == true && playersLost < game.playersLost) {
                    if (a.getSkill().getKnowledge() + a.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        a.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + a.getPlayerNumber() + " lost");
                    }
                }
                if (b.isAlive() == true && playersLost < game.playersLost) {
                    if (b.getSkill().getKnowledge() + b.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        b.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + b.getPlayerNumber() + " lost");
                    }
                }
                if (c.isAlive() == true && playersLost < game.playersLost) {
                    if (c.getSkill().getKnowledge() + c.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        c.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + c.getPlayerNumber() + " lost");
                    }
                }
                if (d.isAlive() == true && playersLost < game.playersLost) {
                    if (d.getSkill().getKnowledge() + d.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        d.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + d.getPlayerNumber() + " lost");
                    }

                }
                if (e.isAlive() == true && playersLost < game.playersLost) {
                    if (e.getSkill().getKnowledge() + e.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200)  {
                        e.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + e.getPlayerNumber() + " lost");
                    }
                }
                if (f.isAlive() == true && playersLost < game.playersLost) {
                    if (f.getSkill().getKnowledge() + f.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        f.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + f.getPlayerNumber() + " lost");
                    }
                }
                if (g.isAlive() == true && playersLost < game.playersLost) {
                    if (g.getSkill().getKnowledge() + g.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        g.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + g.getPlayerNumber() + " lost");
                    }
                }
                if (h.isAlive() == true && playersLost < game.playersLost) {
                    if (h.getSkill().getKnowledge() + h.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        h.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + h.getPlayerNumber() + " lost");
                    }
                }
                if (i.isAlive() == true && playersLost < game.playersLost) {
                    if (i.getSkill().getKnowledge() + i.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        i.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + i.getPlayerNumber() + " lost");
                    }
                }
                if (j.isAlive() == true && playersLost < game.playersLost) {
                    if (j.getSkill().getKnowledge() + j.getSkill().getStrength() + (int) (Math.random() * 100 + 1) <= 200) {
                        j.setAlive(false);
                        SquidGamePlayer.setNumPlayers(SquidGamePlayer.getNumPlayers() - 1);
                        playersLost++;
                        System.out.println("\tPlayer" + j.getPlayerNumber() + " lost");
                    }
                }
            }
        }

    }


    /**
     * This method returns the list of players left after a game
     * @param game game being played
     * @return list of players left
     */

        public static String calcPlayerList (Game game){
            String output = "";
            if (a.isAlive() == true)
                output += "\n\tPlayer 001";
            if (b.isAlive() == true)
                output += "\n\tPlayer 049";
            if (c.isAlive() == true)
                output += "\n\tPlayer 092";
            if (d.isAlive() == true)
                output += "\n\tPlayer 101";
            if (e.isAlive() == true)
                output += "\n\tPlayer 144";
            if (f.isAlive() == true)
                output += "\n\tPlayer 212";
            if (g.isAlive() == true)
                output += "\n\tPlayer 283";
            if (h.isAlive() == true)
                output += "\n\tPlayer 387";
            if (i.isAlive() == true)
                output += "\n\tPlayer 401";
            if (j.isAlive() == true)
                output += "\n\tPlayer 456";
            return output;
        }

    /**
     * This Prints the winner
     */
    public void printWinner(){
        String output = "";
        if (a.isAlive() == true)
            output += "Congratulations! Player001 WINS!!!";
        if (b.isAlive() == true)
            output += "Congratulations! Player049 WINS!!!";
        if (c.isAlive() == true)
            output += "Congratulations! Player092 WINS!!!";
        if (d.isAlive() == true)
            output += "Congratulations! Player101 WINS!!!";
        if (e.isAlive() == true)
            output += "Congratulations! Player144 WINS!!!";
        if (f.isAlive() == true)
            output += "Congratulations! Player212 WINS!!!";
        if (g.isAlive() == true)
            output += "Congratulations! Player283 WINS!!!";
        if (h.isAlive() == true)
            output += "Congratulations! Player387 WINS!!!";
        if (i.isAlive() == true)
            output += "Congratulations! Player401 WINS!!!";
        if (j.isAlive() == true)
            output += "Congratulations! Player456 WINS!!!";
        System.out.println(output);
    }

}

