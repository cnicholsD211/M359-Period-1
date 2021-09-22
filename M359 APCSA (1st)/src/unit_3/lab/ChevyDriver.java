package unit_3.lab;

public class ChevyDriver
{
    public static void main(String[] args)
    {
        // create objects
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)", true, false, true);
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)", true, false, false);

        // *** UTILIZE SETTER METHODS TO COMPLETE THE FOLLOWING: ***
        // set traxBase mileage to 15
        traxBase.setMiles(15);
        // set traxLux mileage to 175 with a luxury and 4WD package
        traxLux.setHasLuxuryPkg(true);
        traxLux.setMiles(175);
        traxLux.setHas4WDPkg(true);

        // printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");
        System.out.println(traxBase);
        System.out.println(traxLux);

        // display price comparison
        System.out.println("*** COMPARE BY PRICE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tLowest price:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (corvetteClassic.compareTo(corvetteSport) < 0)
            System.out.println("Classic Corvette at $" + corvetteClassic.getPrice());
        else if (corvetteClassic.compareTo(corvetteSport) > 0)
            System.out.println("Sport Corvette at $" + corvetteSport.getPrice());
        else
            System.out.println("Tie at $" + corvetteClassic.getPrice());

        // display equality
        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (traxBase.equals(traxLux))
            System.out.println("Same car");
        else
            System.out.println("Not same car");
    }
}
