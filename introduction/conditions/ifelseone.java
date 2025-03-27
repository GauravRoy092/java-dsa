import java.util.Scanner;

public class ifelseone {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // Prompt user for sun status and use logical operators
        System.out.print("Is the sun up? (1 for yes, 0 for no): ");
        int sunInput = sc.nextInt();
        boolean isSunUp = (sunInput == 1);
        
        if (isSunUp) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Night!");
        }
        sc.close();

        // and && or || not ! not equal to !=
    }
}