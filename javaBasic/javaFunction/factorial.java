public class factorial {

    public static int Fact(int num){
        int f = 1;
        
        for(int i = 1;i<=num; i++){
            f = f * i;

        }
        return f;

    }
   
    public static void main(String[] args) {
        int num = 5;
        int f = Fact(num);
        System.out.println("fact: " + f);
        // int f = 1;
        //int num = 5;
        // for(int i = 1;i<=num; i++){
        //     f = f * i;

        // }
        // System.out.println("factorial: "+ f);
    }
}
