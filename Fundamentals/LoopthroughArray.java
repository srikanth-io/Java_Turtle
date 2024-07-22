public class LoopthroughArray {

    String[] $Names = {"Srikanth", "Mayilraj", "Dinesh", "Prathap", "Karthikeyan"};
    public void forEachMethod(){
        for(String i : $Names){
            System.out.println(i);
        }
    }

    public void normalMethod(){
        for (int i = 0; i <$Names.length; i++){
            System.out.println($Names[i]);
            System.out.println($Names[i].length()); //prints how many characters in string value
        }
    }
    public static void main(String[] args) {
        LoopthroughArray obj = new LoopthroughArray(); //non-static variable object creation
        obj.normalMethod();
        obj.forEachMethod();
    }
}


      
