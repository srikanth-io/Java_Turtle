public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        int a = 57;
        int b = 94;

        System.out.println(a + "\n" +b);

        //PreIncrement
        System.out.println("++a = " + ++a);
        System.out.println("--b = " + --b);

        //First Output
        System.out.println("First result for a: " +a);
        System.out.println("First result for b: " +b);

        //PostIncrement
        System.out.println("a++ = " + a++);
        System.out.println("b-- = " + b--);

        //Final Output
        System.out.println("Final result for a: " +a);
        System.out.println("Final result for b: " +b);
    }
}
