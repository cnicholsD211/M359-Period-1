package unit_4.lab;

public class PigLatin {
    public static String translateWordToPigLatin(String str){
        String translate = "";

        if (isVowel(str.substring(0, 1))){
            return str + "yay";
        }
        else {
            return str.substring(isConsonant(str) + 1) + str.substring(0, isConsonant(str) + 1) + "yay";


        }

    }

    public static String toPigLatin(String str){
        String pigLatinPhrase = "";
        int indexSpace = 0;
        System.out.println(str.length());
        for(int i = 1; i <= str.length(); i++){
            System.out.println(i);
            if(str.substring(i - 1, i).equals(" ") || i  == str.length()){
                String pigWord = "";
                if(i == str.length()){
                    pigWord = str.substring(indexSpace, i);
                }
                else {
                    pigWord = str.substring(indexSpace, i - 1);
                }

                pigLatinPhrase = translateWordToPigLatin(pigWord);
                System.out.println(pigWord);
                pigLatinPhrase += " ";
                indexSpace = i;




            }


        }
        return pigLatinPhrase;


    }




    public static boolean isVowel(String str){
        String str1 = str.toLowerCase();
        if (str1.substring(0,1).equals("a") || str1.substring(0,1).equals("e") || str1.substring(0,1).equals("i") || str1.substring(0,1).equals("o") || str1.substring(0,1).equals("u")){
            return true;
        } else {
            return false;
        }
    }

    public static int isConsonant(String str){
        int index = 0;
        for (int i = 0; i < str.length(); i++){
           while(!isVowel(str.substring(i, i + 1))){
               index++;
           }
        }
        return index - 1;

    }






}


