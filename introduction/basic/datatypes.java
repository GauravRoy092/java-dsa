public class datatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte num1 = 127; // 1 byte [-128 to 127]
        short num2 = 32767; // 2 bytes
        int num3 = 2147483647; // 4 bytes
        long num4 = 9223372036854775807L; // 8 bytes
        float num5 = 3.4028235E38f; // 4 bytes
        double num6 = 1.7976931348623157E308; // 8 bytes
        char letter = 'A'; // 2 bytes
        boolean flag = true; // 1 bit // false flag
        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + letter + ", " + flag);

        // Non-Primitive Data Types
        String name = "Aman"+" "+ "Amanu"; // String is a class
        System.out.println(name);
        System.out.println(name.length());

        //concatenation
        String name1 = "Aman";
        String name2 = "Amanu";
        String name3 = name1 + " " + name2;
        System.out.println(name3);
    }
}
