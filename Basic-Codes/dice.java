public class dice {
    public static void main(String[] args) {
        int dice = 1;

        while(dice <= 6){
            if(dice < 6){
                System.out.println("You rolled "+ dice);
            }else{
                System.out.println("You rolled "+ dice + " and won!");
            }
            dice = dice + 1;
        }
    }
}
