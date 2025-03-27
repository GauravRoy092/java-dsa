import java.util.Scanner;

public class lettercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = sc.next().trim().charAt(0);

//        check whether given alphabet is small or capital

        
        if (Character.isUpperCase(ch)) {
            System.out.println("The given alphabet is capital.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The given alphabet is small.");
        } else {
            System.out.println("The input is not an alphabet.");
        }
    }
}
