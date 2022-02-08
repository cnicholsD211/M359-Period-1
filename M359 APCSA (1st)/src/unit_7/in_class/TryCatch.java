package unit_7.in_class;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        boolean isValid = false;
        while (!isValid){
            // try block
            try{
                int[] nums = new int[4];
                nums[4] = 5;
                System.out.println("Enter a number between 1-10:");
                Scanner kb = new Scanner(System.in);
                int num = kb.nextInt();
                if (num > 0 && num < 11){
                    isValid = true;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Choose a valid index");
            }
            catch (Exception e){
                System.out.println("Ooops, please enter a valid number in the range 1-10:");
            }

        }

    }
}
