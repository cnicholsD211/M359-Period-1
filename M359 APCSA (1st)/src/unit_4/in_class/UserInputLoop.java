package unit_4.in_class;

import java.util.Scanner;

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);    // creating scanner object

        System.out.print("Please enter the first number to be added (enter 999 to stop): ");
        int num = kb.nextInt();     // read input value
        int sum = 0;

        while (num != 999){
            sum += num;     // add input value to sum
            System.out.println("Please enter another number (enter 999 to stop): ");
            num = kb.nextInt();
        }

        System.out.println("The sum of your entries is " + sum);
    }
}
