public class averageAge {
    public static void main(String[] args) {
        int[] ages = {20,25,30,40,23,74,56,43,48,60,28};

        int avg, sum =0;

        //finding length of arrays
        int len = ages.length;

        //for each loop to getting res
        for(int age : ages){
            System.out.println(age);
            sum += age;
        }

        //calculating average with sum / length of array
        avg = sum / len;

        System.out.println("The average age is : "+ avg);
    }
}
