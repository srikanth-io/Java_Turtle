
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 76;
        int b = 34;

        System.out.println("a & b = " + (a & b) );
        System.out.println("a | b = " + (a | b) );
        System.out.println("a ^ b = " + (a ^ b) );
        System.out.println("~b = " + (~b) ); //Bitwise Not
        System.out.println("a << b = " + (a << b) ); //Left Shift
        System.out.println("a >> b = " + (a >> b) ); //Right Shift
        System.out.println("a >>> b = " + (a >>> b) ); //Unsigned Right shift

    }
}
