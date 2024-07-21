public class ifelseifStatement {
    public static void main(String[] args) {
        String trafficLight = "Green Light";
        
        System.out.println("3, 2, 1 ...");
        if (trafficLight.equals("Red")) {
            System.out.println("Red Light");
        }else if(trafficLight.equals("Green Light")){
            System.out.println("Green Light");
        }else{
            System.out.println("Yellow Light");
        }

    }
}
