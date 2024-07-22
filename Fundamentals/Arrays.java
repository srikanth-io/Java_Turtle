public class Arrays {

    public static class OneDimentionalArray {
        public void oneDimentionalMethod(){
        
            //one dimentional array
    
            int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    
            // Print the array elements, not the memory address
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
    
    
        }
        
    }
   


    public static class MultiDimentionalArray{
        int[][] MultiVariable = {{1,2,3,4,5,6},{11,12,13,14,15}};

        //Accesing multidimentional array
        public void multiMethod(){
            System.out.println(MultiVariable[0][2]);
        }
    }


    
    public static void main(String[] args) {

         // Array index
         String[] cars = {"volvo", "Bently", "Rolls Royce", "Bugatti", "Ferrari"}; 
         cars[4] = "Lamborgini";
         System.out.println(cars[4]);
 
 
         //Array Length
         int[] integerNumber = {10,20,30,40,50,60,70,80,90};
         System.out.println(integerNumber.length);

         // Create instances of inner classes
         OneDimentionalArray oneDimentionalArray = new OneDimentionalArray();
         oneDimentionalArray.oneDimentionalMethod();
         
         MultiDimentionalArray multiDimentionalArray = new MultiDimentionalArray();
         multiDimentionalArray.multiMethod();
    }

}