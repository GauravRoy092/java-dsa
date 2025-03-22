// // public class looponeif {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner (System.in);
// //         System.out.println("Enter your number: ");
// //         int endnumber = sc.nextInt();
// //         for (1= 0; i <= endnumber ; i++){
// //             if (i == 3){
// //                 System.out.println("Three"); 
// //             } else {
// //                 System.out.println(i);
// //         }
// //         }
// //     }
// // }
// import java.util.Scanner;

// public class looponeif {
//     public static void main(String[] args) {

//         // icreasing way kinda 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter end number: ");
//         int endNumber = sc.nextInt();
        
//         for (int i = 0; i <= endNumber; i++) {
//             System.out.print(i + " ");
//         }
        
//         sc.close();

//         // decreasing way
//         Scanner sc2 = new Scanner(System.in);
//         System.out.print("Enter end2 number: ");
//         int endNumber2 = sc2.nextInt();
        
//         for ( i = endNumber2; i >= 0; i--) {
//             System.out.print(i + " ");
//         }
        
//         sc2.close();
//     }
// }


import java.util.Scanner;

public class looponeif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Increasing sequence
        System.out.print("Enter end number for increasing sequence: ");
        int endNumber = sc.nextInt();
        
        for (int i = 0; i <= endNumber; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println();  // Add line break between sequences

        // Decreasing sequence
        System.out.print("Enter end number for decreasing sequence: ");
        int endNumber2 = sc.nextInt();
        
        for (int i = endNumber2; i >= 0; i--) {
            System.out.print(i + " ");
        }
        
        sc.close();  // Close scanner once at the end
    }
}