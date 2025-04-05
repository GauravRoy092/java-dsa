public class switching {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // Without this break, the next case will also be executed
            default:
                System.out.println("Thursday");
                break;
        }
    }
}
