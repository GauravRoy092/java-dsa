// package casting;

import java.util.Scanner;
public class casttingy {
    public static void main(String[] args) {
        // implicit casting
        int prize = 100;
        double taxRate = 18.0 / 100.0; 
        double finalPrize = prize + (prize * taxRate);
        System.out.println(finalPrize);  // Output: 118.0

        // explicit casting
        int finalPrizeExplicit = prize + (int)(prize * taxRate);
        System.out.println(finalPrizeExplicit);  // Output: 118

        // for making constant values
        final float PI = 3.14F;
        // for input age
        Scanner scone = new Scanner(System.in);
        int age = scone.nextInt();
        System.out.println(age);  // Output: 20
        System.out.println(PI);  // Output: 3.14

        // string input
        System.out.println("Enter your name: ");
        Scanner sctwo = new Scanner(System.in);
        String name = sctwo.next();
        System.out.println(name);  // Output: John Doe
    }
}
