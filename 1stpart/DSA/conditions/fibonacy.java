
import java.util.Scanner;

public class fibonacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of terms you want to print: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series: " + n + " given term");

        int first_term= 0, second_term = 1;
        for (int i =1 ; i <= n; i++) {
            System.out.print(first_term + " ");
            int last_term = first_term + second_term;
            first_term = second_term;
            second_term = last_term;

            sc.close();

        }
    }
    
}
