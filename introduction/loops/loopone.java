import java.util.Scanner;


public class loopone {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Increasing sequence
        System.out.print("Enter the number :");
        int num = sc .nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println("for list increase: " +i + " ");
        }
        // decreasing sequence
        for (int i = num; i >= 1; i--) {
            System.out.println("for list decrease: " + i + " ");
        }

        // while loop at the end no semicolons
        int j = 0;
        while (j <= num) {
            System.out.println("While list : " + j + " " );
            j++;
        }

        // do while loop at the end semicolons
        int k = 0;
        do {
            System.out.println("Do while list : " + k + " ");
            k++;
        } while (k <= num);

    }
}
