import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
//        fruit switch case
        System.out.println("Enter the fruit (apple or banana) : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "apple" -> System.out.println("doctors away !?");
            case "banana" -> System.out.println("banana");
            default -> System.out.println("nothing");
        }
    }
}
