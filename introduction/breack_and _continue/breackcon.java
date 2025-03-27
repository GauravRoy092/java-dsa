public class breackcon {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue; // Skip iteration when i is 4
            }
            System.out.print(i + " ");
        }
    }
}