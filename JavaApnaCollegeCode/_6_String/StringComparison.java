public class StringComparison {
    public static void main(String[] args) {
        
        String str1 = "Arman";
        String str2 = "Arman";
        String str3 = new String("Arman");

        if(str1 == str2){
            System.out.println("both are same");
        }
        else{
            System.out.println("not same");
        }
        if(str1 == str3){ // both location are different
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
        }
        if(str2.equals(str3)){ // it's check just the value not location
            System.out.println("str2 and str3 both are same");
        }
        else{
            System.out.println("not same");
        }
    }
}
