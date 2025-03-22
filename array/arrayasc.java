

public class arrayasc {
        /**
         * Sorts an array in ascending order using nested loops, and prints the sorted array.
         * The outer loop iterates through the array, and the inner loop starts from the next element
         * (i + 1) and compares it with the current element. If the current element is greater than
         * the compared element, they are swapped. At the end, the sorted array is printed.
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 9, 3, 2, 1};
        
        // Sorting the array in ascending order using nested loops
        for (int i = 0; i < arr.length; i++) {
            // The inner loop starts from the next element (i + 1)
            for (int j = i + 1; j < arr.length; j++) {
                // If the current element is greater than the compared element, swap them
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Print the sorted array
        System.out.println("Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
