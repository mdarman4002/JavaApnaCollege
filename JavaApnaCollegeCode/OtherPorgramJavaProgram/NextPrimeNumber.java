public class NextPrimeNumber{
    public static void main(String[] args) {
        int inp = 1000;
        System.out.println("nextPrime: "+ primeFunc(inp));
    }
    public static int primeFunc(int inp){
        for(int i = inp+1; ; i++){
          boolean isPrime = true;
            for(int j = 2; j<=(i/2) ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }   
            }
            if(isPrime == true){
                return i;
            }
        }
    }
}