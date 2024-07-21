public class nestedifStatement {
    public static void main(String[] args) {
        int $mage = 25;
        int $fage = 20;
        String $mgender = "male";
        String $fgender = "female";

        if ($mgender == "male" && $mage == 25) {
            System.out.println("Male You are eligible for getting Marriage");
            

            if ($fgender == "female" && $fage == 18) {
                System.out.println(" Female You are eligible for getting Marriage");
            }else{
                System.out.println("Female Not eligible");
            }
        }else{
            System.out.println("male Not eligible");
        }
    }    
}
