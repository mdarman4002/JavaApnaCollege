public class StringLowerCase {
    public static void main(String[] args) {
        String str = "Hello";
        // toLowerCase(str);
        System.out.println("in LowerCase: "+toLowerCase(str));
        System.out.println("in LowerCase: "+toLowerCase("I AM  @ Mohammad Arman"));
        
    }
    public static String toLowerCase(String str){
        char ar[] = str.toCharArray();
        for(int i= 0;i<= ar.length-1 ; i++){
            if(ar[i] <= 90 && ar[i] >= 65){
                ar[i] = (char) (ar[i] + 32);

            }
        }
        return new String (ar);
    }
}
