import java.util.Scanner;

public class newloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = sc.nextInt();

        switch (empID) {
            case 101 -> {
                System.out.print("Enter Department for ID 101 (IT/HR): ");
                String deptName = sc.next();
                switch (deptName) {
                    case "IT" -> System.out.println("Valid Department: IT");
                    case "HR" -> System.out.println("Valid Department: HR");
                    default -> System.out.println("Invalid Department for ID 101");
                }
            }
            case 102 -> System.out.println("Predefined Department: Finance");
            case 103 -> System.out.println("Predefined Department: Marketing");
            default -> {
                System.out.println("Invalid Employee ID!");
                System.out.print("Enter Department to validate: ");
                String dept = sc.next();
                switch (dept) {
                    case "Finance", "Marketing" -> System.out.println("Valid Department");
                    default -> System.out.println("Invalid Department");
                }
            }
        }
    }
}