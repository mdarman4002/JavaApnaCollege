public class FindChar {
    public static void main(String[] args) {
        String main = "I am Indian";
        String sub = "dian";
        matchingChar(main, sub);

    }
    public static void matchingChar(String main, String sub){
        int mainLegth = main.length();

        for(int i = 0; i< mainLegth; i++){
            if(main.charAt(i) == sub.charAt(0)){
                System.out.println("String matched at index: "+ i);
                return;
            }
            
        }
        System.out.println("not matched");
    }
}
