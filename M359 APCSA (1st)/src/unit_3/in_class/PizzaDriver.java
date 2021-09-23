package unit_3.in_class;

public class PizzaDriver
{
    public static void main(String[] args)
    {
        // Instantiate several Pizza objects
        Pizza lous = new Pizza("Lou's", 14, 5, true);
        Pizza jacks = new Pizza("Jacks", 14, 1, false);
        Pizza georgios = new Pizza("Georgio's", 14, 5, true);
        Pizza costco = new Pizza("Costco", 18, 3, false);

        System.out.println("Comparing Lou's and Jacks");
        boolean lToJ = lous.equals(jacks); // the "this" reference refers to lous
        System.out.println("Same:\t" + lToJ);

        System.out.println("Comparing Lou's and Georgio's");
        System.out.println("Same:\t" + georgios.equals(lous)); // the "this" refers to georgios

        System.out.println("Comparing Jacks and Costco");
        System.out.println("Same:\t" + jacks.equals(costco)); // the "this" refers ot jacks

        System.out.println("Compare Costco's inches to Georgio's inches");
        System.out.println(costco.compareTo(georgios));
        System.out.println(georgios.compareTo(costco));

        System.out.println("Compare Jack's inches to Lou's inches");
        System.out.println(jacks.compareTo(lous));
        System.out.println(lous.compareTo(jacks));

        System.out.println("Mmmmmm pizza is delcious!");
    }
}
