public class ternaryEvenOdd{
    public static void main(String[] args) {
        int num = 11;
        String type = ((num % 2) == 0)? "even" :" odd";
        System.out.println("type: "+ type);
    }
}