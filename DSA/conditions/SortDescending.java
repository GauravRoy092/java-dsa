
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        // increasing part
        int[] numbers = {5, 2, 7, 1, 9}; // Example input
        Arrays.sort(numbers); // Step 1: Sort in ascending order (0 n log n)
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // decreasing part
        for (int i = 0; i < numbers.length / 2; i++) { // O(n)
        int temp = numbers[i];
        numbers[i] = numbers[numbers.length - i - 1];
        numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("Desending Order: " + Arrays.toString(numbers));
        // int num = 93209;
        // int ans = 0;
        // while (num > 0) {
        //     int rem = num % 10;
        //     num /= 10;

        //     ans = ans * 10 + rem;
        // }

        // System.out.println(ans);

    }
}