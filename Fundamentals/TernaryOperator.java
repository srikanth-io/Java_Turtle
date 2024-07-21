
public class TernaryOperator {
    public static void main(String[] args) {
        int age1 = 18;
        int age2 = 29;

        String result = (age2 >= 30) && (age1 == 18) ? "Ready" : "NotReady";
        System.out.println(result);
    }
}
