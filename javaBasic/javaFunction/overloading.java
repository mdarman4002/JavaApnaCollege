public class overloading {
    
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static float sum(float a, float b){
        return ( a + b);
    }
    public static void main(String[] args) {
        System.out.println("sum int (a + b): "+ sum(5,4));
        System.out.println("sum int (a + b + c): "+ sum(5,4, 8));
        System.out.println("sum float (a + b): "+ sum(5.6f,4.4f));
        
    }
}
