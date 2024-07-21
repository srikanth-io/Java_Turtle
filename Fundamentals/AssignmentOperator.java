public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 20;

        System.out.println("a += " + (a += 98));
        System.out.println("a -= " + (a -= 98));
        System.out.println("a *= " + (a *= 98));
        System.out.println("a /= " + (a /= 98));
        System.out.println("a %= " + (a %= 98));
    }
}
