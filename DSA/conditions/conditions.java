import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        
        int salary = sc.nextInt(); //


        if (salary > 10000){
            salary = salary +2000;
            System.out.print("Salary is increase by $2000 : " + salary);
        } else {
            salary = salary + 1000;
            System.out.print("Salary is increase by $1000 : " + salary);
        }
    }
}
