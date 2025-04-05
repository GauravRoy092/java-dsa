import java.util.Arrays;

public class array0 {
    public static void main(String[] args) {
        int age =30;
        int math = 90;
        int science = 85;
        int english = 80;

        int[] marks = new int[3];
        marks[0] = math;
        marks[1] = science; 
        marks[2] = english;
        System.out.println("marks[0] = " + marks[0]);
        System.out.println("marks[1] = " + marks[1]);    
        System.out.println("marks[2] = " + marks[2]);
        System.out.println("Total marks = " + (marks[0] + marks[1] + marks[2]));
        Arrays.sort(marks);
        System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println("Ascending Order marks[0] is:" + marks[0] );

    }
}
