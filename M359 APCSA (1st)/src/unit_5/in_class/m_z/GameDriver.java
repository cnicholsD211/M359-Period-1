package unit_5.in_class.m_z;
// Zach and Miheer
// Mr.Nichols
// Period 1
// this class creates the player and team objects and has them play games against each other
public class GameDriver {
    private static final int MAX_SCORE = 11;

    public static void main(String[] args) {
        Player alexCaruso = new Player("Alex Caruso", new Stats(106.1, 107.3));

        Player khrisMiddleton = new Player("Khris Middleton", new Stats(109.3, 112.8));

        Player russellWestbrook = new Player("Russell Westbrook", new Stats(104.5,109.7));

        Player stephCurry = new Player("Steph Curry", new Stats(119.0, 107.0));

        Team bulls = new Team("The Bulls", khrisMiddleton, russellWestbrook);
        Team knicks = new Team("The Knicks",alexCaruso, stephCurry);

        // call calcAvgOffRating() and calcAvgDefRating();
        Player.calcAvgOffRating();
        Player.calAvgDefRating();
        System.out.println();

        // game between the bulls and knicks
        twoOnTwo(bulls, knicks);
        System.out.println();
        // game between Alex Caruso and Steph Curry
        oneOnOne(alexCaruso, stephCurry);
    }

    /** This function has two teams play a game with each other to 11
     * @param homeTeam - first team that is created to play
     * @param awayTeam - second team that is created to play
     */
    public static void twoOnTwo (Team homeTeam, Team awayTeam){
       int homePoints = 0;
       int awayPoints = 0;

       while(homePoints < MAX_SCORE && awayPoints < MAX_SCORE){
           double homeTeamPlayerOneShot = Math.random() * homeTeam.getPlayerOne().getPlayerStats().getOffRating();
           double homeTeamPlayerTwoShot = Math.random() * homeTeam.getPlayerTwo().getPlayerStats().getOffRating();
           double awayTeamPlayerOneShot = Math.random() * awayTeam.getPlayerOne().getPlayerStats().getOffRating();
           double awayTeamPlayerTwoShot = Math.random() * awayTeam.getPlayerTwo().getPlayerStats().getOffRating();

           double homeTeamPlayerOneSteal = Math.random() * homeTeam.getPlayerOne().getPlayerStats().getDefRating();
           double homeTeamPlayerTwoSteal = Math.random() * homeTeam.getPlayerTwo().getPlayerStats().getDefRating();
           double awayTeamPlayerOneSteal = Math.random() * awayTeam.getPlayerOne().getPlayerStats().getDefRating();
           double awayTeamPlayerTwoSteal = Math.random() * awayTeam.getPlayerTwo().getPlayerStats().getDefRating();

           if(homeTeamPlayerOneShot > awayTeamPlayerOneSteal && homeTeamPlayerOneShot > awayTeamPlayerTwoSteal){
               System.out.println(homeTeam.getPlayerOne().getName() + " scores for " + homeTeam.getName() + "!");
               homePoints += Math.random() * 3 + 1; // adds point to score
               System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
               if(homePoints >= MAX_SCORE)
               {
                   break;
               }
           }
           if(homeTeamPlayerTwoShot > awayTeamPlayerOneSteal && homeTeamPlayerTwoShot > awayTeamPlayerTwoSteal){
               System.out.println(homeTeam.getPlayerTwo().getName() + " scores for " + homeTeam.getName() + "!");
               homePoints += Math.random() * 3 + 1; // adds point to score
               System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
               if(homePoints >= MAX_SCORE)
               {
                   break;
               }
           }
           if(awayTeamPlayerOneShot > homeTeamPlayerOneSteal && awayTeamPlayerOneShot > homeTeamPlayerTwoSteal){
               System.out.println(awayTeam.getPlayerOne().getName() + " scores for " + awayTeam.getName() + "!");
               awayPoints += Math.random() * 3 + 1;
               System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
               if(awayPoints >= MAX_SCORE)
               {
                   break;
               }
           }
           if(awayTeamPlayerTwoShot > homeTeamPlayerOneSteal && awayTeamPlayerTwoShot > homeTeamPlayerTwoSteal){
               System.out.println(awayTeam.getPlayerTwo().getName() + " scores for " + awayTeam.getName() + "!");
               awayPoints += Math.random() * 3 + 1;
               System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
               if(awayPoints >= MAX_SCORE)
               {
                   break;
               }
           }

       }

       if(homePoints >= MAX_SCORE){ // when a team gets to 11, they win
           System.out.println(homeTeam.getName() + " win!!");
       }
       else{
            System.out.println(awayTeam.getName() + " win!!");
       }
        
    }

    /**
     * This method has two player play a game to 11
     * @param homePlayer - first player
     * @param awayPlayer - second player
     */
    public static void oneOnOne (Player homePlayer, Player awayPlayer){
        int homePoints = 0;
        int awayPoints = 0;

        while(homePoints < MAX_SCORE && awayPoints < MAX_SCORE){
            double homePlayerShot = Math.random() * homePlayer.getPlayerStats().getOffRating();
            double awayPlayerShot = Math.random() * awayPlayer.getPlayerStats().getOffRating();

            double homePlayerSteal = Math.random() * homePlayer.getPlayerStats().getDefRating();
            double awayPlayerSteal = Math.random() * awayPlayer.getPlayerStats().getDefRating();

            if(homePlayerShot > awayPlayerSteal){
                System.out.println(homePlayer.getName() + " scored!");
                homePoints += Math.random() * 3 + 1; // adds point to score
                System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
                if(homePoints >= MAX_SCORE)
                {
                    break;
                }
            }
            else{
                System.out.println(awayPlayer.getName() + " stole the ball!");
            }
            if(awayPlayerShot > homePlayerSteal){
                System.out.println(awayPlayer.getName() + " scored!");
                awayPoints += Math.random() * 3 + 1;
                System.out.println("Home: " + homePoints + " " + "Away: " + awayPoints);
                if(awayPoints >= MAX_SCORE)
                {
                    break;
                }
            }
            else{
                System.out.println(homePlayer.getName() + " stole the ball!");
            }

        }

        if(homePoints >= MAX_SCORE){ // when a team gets to 11, they win
            System.out.println(homePlayer.getName() + " wins!!");
        }
        else{
            System.out.println(awayPlayer.getName() + " wins!!");
        }

    }

}
