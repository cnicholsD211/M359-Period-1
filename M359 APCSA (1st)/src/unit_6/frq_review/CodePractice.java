package unit_6.frq_review;

public class CodePractice {
    public static void main(String[] args) {
        // initializer list
        int[] nums = {82, 47, 8247, 4287};
        String[] words;
        //words = {"Does", "This", "Work"};  THIS DOES NOT WORK

        // create and fill an array
        int[] perfSquares = new int[20];
        for (int i = 0; i < perfSquares.length; i++){
            perfSquares[i] = (i + 1) * (i + 1);
        }

        // use a for each loop to print each vaue of perfSquares
        for (int tempSquare: perfSquares){
            System.out.println(tempSquare);
        }

        String[] names = {"Nichols", "Denna", "Moon"};
        // change all names in the array to ALL CAPS
        for (int i = 0; i < names.length; i++){
            names[i] = names[i].toUpperCase();
        }
        // Print each element using a for each loop
        for (String tempName: names){
            System.out.println(tempName);
        }

        String[] lyrics = {"Oops", "I", "Did", "It", "Again"};
        // write a loop that counts the total number of characters in the lyrics array
        int count = 0;
        for(String tempLyric: lyrics){
            count += tempLyric.length();
        }
        for (int i = 0; i < lyrics.length; i++){
            count += lyrics[i].length();
        }
        System.out.println(count);
    }
}
