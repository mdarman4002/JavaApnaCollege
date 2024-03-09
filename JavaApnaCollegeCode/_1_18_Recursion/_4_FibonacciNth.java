public class _4_FibonacciNth {
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(fib(n));
        for(int i=0; i <= n; i++){
            System.out.println(fib(i)+" ");
        }
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        //return output;
    }
}
