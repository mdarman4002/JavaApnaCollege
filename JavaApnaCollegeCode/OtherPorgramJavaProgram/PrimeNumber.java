public class PrimeNumber {
    public static void main(String[] args) {
        int inp = 1009;
        System.out.println("isPrime: "+ checkPrime(inp));
    }
    public static boolean checkPrime(int inp){
        for(int i = 2; i <= inp/2; i++){ 
            if(inp % i == 0){
               return false;
            }
        }
        return true;
    }
}
