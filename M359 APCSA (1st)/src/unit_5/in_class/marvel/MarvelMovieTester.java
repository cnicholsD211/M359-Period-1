package unit_5.in_class.marvel;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // Broken down creation of a SuperHero object
        String name = "The Hulk";
        Power superPower = new Power("Super Strength", 100);
        SuperHero hulk = new SuperHero(name, superPower);

        // Concise creation of a SuperHero object
        SuperHero superman = new SuperHero("Superman", new Power("Flight", 75));

        // Create a Villain named Loki with superStrength
        Villain loki = new Villain("Loki", new Power("Super Strength", 100));

        // Initial Printout
        System.out.println(hulk);

        // change the hulk's Power strength
        hulk.getSuperPower().setStrength(150);

        System.out.println(superman);
        System.out.println(loki);

        battle(hulk, loki);

    }

    public static void battle(SuperHero goodGuy, Villain badGuy){
        while(goodGuy.getHealth() != 0 && badGuy.getHealth() != 0) {
            boolean heroHit = Math.random() < 0.5;  // [0, 0.5) hit [0.5, 1) miss
            boolean villainHit = Math.random() < 0.5;

            if (heroHit) {
                badGuy.setHealth(badGuy.getHealth() - goodGuy.getSuperPower().getStrength());
                if (badGuy.getHealth() < 0){
                    badGuy.setHealth(0);
                }
                System.out.println("The hulk smashed Loki in the face!");
            }
            if (villainHit) {
                goodGuy.setHealth(goodGuy.getHealth() - badGuy.getSuperPower().getStrength());
                if (goodGuy.getHealth() < 0){
                    goodGuy.setHealth(0);
                }
                System.out.println("Loki slashes the hulk!");
            }
            // if neither thing hits
            if (!heroHit && !villainHit){
                System.out.println("Both characters swung and missed!");
            }

            // printout for health
            System.out.println("Hulk Health: " + goodGuy.getHealth());
            System.out.println("Loki Health: " + badGuy.getHealth());
            System.out.println();
        }

        // check for a winner
        if (goodGuy.getHealth() == 0)
        {
            System.out.println("Oh no, the bad guys have done it again :(");
        }
        else{
            System.out.println("Congratulation, the world is safe again!");
        }
    }
}
