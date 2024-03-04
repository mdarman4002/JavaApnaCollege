public class ClearLastNbits {
    // public static void main(String[] args) {
    //     func(15, 2);
    // }
    // public static void func(int num, int clr){
    //     int bitMask = (~(0) << clr);
    //     System.out.println(bitMask);
    //     System.out.println(num & bitMask);
    //     System.out.println("~0 in to bit :"+ Integer.toBinaryString(~0));
    //     System.out.println("-1 in to bit :"+ Integer.toBinaryString(-1));
    // }
    public static void main(String[] args) {
	    System.out.println(isPalindrome( 101));
		
	}
	public static boolean isPalindrome(int x){
	    String intToStr = Integer.toString(x);
	    StringBuffer rev = new StringBuffer(intToStr).reverse();
	    if (rev.toString().equals(intToStr)){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
