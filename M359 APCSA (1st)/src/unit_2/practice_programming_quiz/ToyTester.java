package unit_2.practice_programming_quiz;

public class ToyTester {
    public static void main(String[] args) {


        Toy myTruck = new Toy("TONKA", 9.99);

        // Part E
        // Use the myTruck reference variable and calculate the total.
        // Store in an appropriate variable
        double total = myTruck.calcTotal();

        String toyName = myTruck.getName();
        String lowerName = toyName.toLowerCase();

        System.out.println("Your Toy:\t" + myTruck.getName().toLowerCase());
        System.out.println("Price:\t\t$" + myTruck.getPrice());
    }
}
