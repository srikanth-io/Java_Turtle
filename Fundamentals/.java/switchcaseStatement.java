public class switchcaseStatement {
    public static void main(String[] args) {
        String days = "wednesday";

        switch (days) {
            case ("monday"):
                System.out.println("Monday");
                break;
            case ("tuesday"):
                System.out.println("Tuesday");
                break;
            case ("wednesday"):
                System.out.println("Wednesday");
                break;
            case ("thursday"):
                System.out.println("Thursday");
                break;
            case ("friday"):
                System.out.println("Friday");
                break;
        
            default:
                System.out.println("Holiday day");
                break;
        }
    }
}
