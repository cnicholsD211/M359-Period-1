package unit_6.Tester;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();

        letters.add("C");
        letters.add("J");
        letters.add(1, "E");
        letters.set(0, "M");
        letters.remove(2);
        letters.add(letters.remove(0));

    }
}
