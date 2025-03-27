public class countnumbers {
    public static void main(String[] args) {
        // Start with the number we want to check
        int n = 126656;
        // Create a counter starting at 0
        int count = 0;
        
        // Keep working while the number is bigger than 0
        while (n > 0) {
            // Get the last digit of the number
            int digit = n % 10;
            
            // Check if this digit is 6
            if (digit == 6) {
                count++; // If yes, increase our counter
            }
            
            // Remove the last digit from the number
            n = n / 10;
        }
        
        // After checking all digits, print the result
        System.out.println(count);
    }
}