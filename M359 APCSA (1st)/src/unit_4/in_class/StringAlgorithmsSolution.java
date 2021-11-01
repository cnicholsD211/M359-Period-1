package unit_4.in_class;

public class StringAlgorithmsSolution {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for (int i = 0; i < mySchool.length(); i += 2) {
            System.out.print(mySchool.substring(i, i+1));
        }

        System.out.println();

        // print the String mySchool in reverse (all characters on the same line)

        for (int i = mySchool.length() - 1; i >= 0; i--) {
            System.out.print(mySchool.substring(i, i+1));
        }

        System.out.println();


         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */

        String animal = "monkey";
        for (int i = 1; i <= animal.length(); i++) {
            System.out.println(animal.substring(0, i));
        }

        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // how many times does the word "little" appear within the phrase?
        int count = 0;
        int index = -1;
        int loc = -1;
        String findPhrase = " little";

        while (index < phrase.length()) {
            phrase = phrase.substring(index + 1);
            loc = phrase.indexOf(findPhrase);
            if (loc != -1) { // found
                count++;
                index = loc;
            }
            else {
                index++;
            }
        }

        System.out.println("\nThe word \"little\" appears in phrase " + count + " times.");

        // create a new String, called basicPhrase, that removes the word "little"
        // entirely

        // reset variables
        phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        index = -1;
        loc = -1;

        while (index < phrase.length()) {
            loc = phrase.indexOf(findPhrase);
            if (loc != -1) { // found
                phrase = phrase.substring(0, loc) + phrase.substring(loc + findPhrase.length());
                index = loc;
            }
            else {
                index++;
            }
        }

        System.out.println("The new string is: \n\n " + phrase);

        // create a new String (based on phrase), called bigPhrase, that replaces
        // the word "little" with the word "BIG"

        phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        index = -1;
        loc = -1;

        while (index < phrase.length()) {
            loc = phrase.indexOf(findPhrase);
            if (loc != -1) { // found
                phrase = phrase.substring(0, loc) + " BIG" + phrase.substring(loc + findPhrase.length());
                index = loc;
            }
            else {
                index++;
            }
        }

        System.out.println("The new string is: \n\n " + phrase);




    }
}
