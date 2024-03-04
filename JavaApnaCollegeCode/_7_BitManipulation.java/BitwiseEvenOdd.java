public class BitwiseEvenOdd {
    public static void main(String[] args) {
        checkFunc(10);
    }
    public static void checkFunc(int a){
        int bitMask = 1;
        if((a & bitMask )== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
