package unit_5.in_class.c_s;

public class GameTester {


    public static void main(String[] args) {


        //Create Skill objects
        Skill smart = new Skill("Smart", true);
        Skill strong = new Skill(true, "Strong");
        Skill smartStrong = new Skill("Smart and Strong", true, true);
        Skill weak = new Skill("Weak");


        // Create player objects

        SquidGamePlayer player1 = new SquidGamePlayer("001", smart);
        SquidGamePlayer player456 = new SquidGamePlayer("456", smartStrong);
        SquidGamePlayer player101 = new SquidGamePlayer("101", strong);
        SquidGamePlayer player212 = new SquidGamePlayer("212", weak);
        SquidGamePlayer player387 = new SquidGamePlayer("387", smart);
        SquidGamePlayer player92 = new SquidGamePlayer("092", smartStrong);
        SquidGamePlayer player283 = new SquidGamePlayer("283", strong);
        SquidGamePlayer player49 = new SquidGamePlayer("049", weak);
        SquidGamePlayer player401 = new SquidGamePlayer("401", smart);
        SquidGamePlayer player144 = new SquidGamePlayer("144", strong);

        //Create Game objects
        Game RedLightGreenLight = new Game("Red Light Green Light", false, true, 2, player1, player49, player92, player101, player144, player212, player283, player387, player401, player456) ;
        Game TugOfWar = new Game("Tug of War", true, false, 4);
        Game Marbles = new Game("Marbles", false, true, 2);
        Game SquidGame = new Game("Squid Game", true, true, 1);





        //Printouts of info
        System.out.println(player1);
        System.out.println(player49);
        System.out.println(player92);
        System.out.println(player101);
        System.out.println(player144);
        System.out.println(player212);
        System.out.println(player283);
        System.out.println(player387);
        System.out.println(player401);
        System.out.println(player456);
        System.out.println();
        System.out.println();

        //Print games
        Game.calcGameNumber(RedLightGreenLight);
        RedLightGreenLight.playGame(RedLightGreenLight);
        Game.calcGameNumber(TugOfWar);
        TugOfWar.playGame(TugOfWar);
        Game.calcGameNumber(Marbles);
        Marbles.playGame(Marbles);
        Game.calcGameNumber(SquidGame);
        SquidGame.playGame(SquidGame);

        //Print winner
        System.out.println();
        SquidGame.printWinner();

    }
}











