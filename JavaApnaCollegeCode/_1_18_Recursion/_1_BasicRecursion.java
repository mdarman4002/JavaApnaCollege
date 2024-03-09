public class _1_BasicRecursion{
    public static void main(String[] args) {
        int num = 10;
        decOrder(num); // 10 to 1;
        incOrder(1); // 1 to 10;
        printIncOrder(num);// 1 to 10;
    }
    public static void decOrder(int num){
        if(num == 1){
            System.out.print(1);
            return;
        }
        System.out.print(num+" ");
        decOrder(num-1);
    }
    public static void incOrder(int num){
        if(num == 10){
            System.out.print(10);
            return;
        }
        else if(num == 1){
            System.out.println(" ");
        }
        
        System.out.println(num);
        incOrder(num + 1);
    }
    public static void printIncOrder(int num){
        if(num == 1){
            System.out.println();
            System.out.println(1);
            return;
        }
        
        printIncOrder(num-1);
        System.out.println(num);
    }

}