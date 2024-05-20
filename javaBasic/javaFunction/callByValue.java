public class callByValue {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a from func: "+ a);
        System.out.println("b from func: "+ b);
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        // swap( m, n );
        System.out.println("a from main: "+ n);
        System.out.println("b from main: "+ m);
        swap(n, m);

    }
}
