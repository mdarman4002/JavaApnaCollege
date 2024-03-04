public class Palindrome {
    public static void main(String[] args) {
        String pal = "12232211";
        System.out.println(palindrome(pal));
    }
    public static boolean palindrome(String pal){
        int size =pal.length();
        for (int i = 0; i < (pal.length()/2); i++){
            if(pal.charAt(i) != pal.charAt(size-1-i)){
                return false;
            }   
        }
        return true;
    }
}
