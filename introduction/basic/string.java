public class string {
    public static void main(String[] args) {
         //concatenation
         String name1 = "Aman";
         String name2 = "Amanu";
         String name3 = name1 + " and " + name2;
         System.out.println(name3);

         //char at (mane character kaha eh ) position 0 se shuru hoti he 
         char c = name2.charAt(4);
         System.out.println(c);

         //lenght
         int len = name2.length();
         System.out.println(len);

         //replace
         String newName = name2.replace("Amanu", "Amany");
         System.out.println(newName);
         System.out.println(name2); //string is immutable and if want change make new string


         //substring 
            String subName = name2.substring(2,4);
            System.out.println(subName);
    }
}
