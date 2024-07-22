public class LowestAge {
    public static void main(String[] args) {
        int[] ages = {10, 29, 15, 30, 48, 27, 5, 13, 56, 36};
        
        int lowestAge = ages[0];

        for(int age : ages){
            if (lowestAge > age){
                lowestAge = age;
            }
        }

        System.out.println("the lowest age is "+ lowestAge);

    }
}
