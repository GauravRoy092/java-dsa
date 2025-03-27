import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit : ");
        String fruit = sc.next();

//        the if statement is used instead ogf switch statement

        if (fruit.equals("apple")) {
            System.out.println("doctors away");
        } else if (fruit.equals("banana")) {
            System.out.println("banana");
        } else {
            System.out.println("nothing");
        }

    }
}
