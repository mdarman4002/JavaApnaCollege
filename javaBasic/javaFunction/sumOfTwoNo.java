import java.util.*;
public class sumOfTwoNo {

    public static int calculateSum(int A, int B){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        int A = sc.nextInt();
        System.out.println("B: ");
        int B = sc.nextInt(); */
        
        int sum = A + B ;
        return sum;
        // System.out.println("sum: "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();
        // int Sum = calculateSum(a,b);
        // System.out.println("Sum: "+ Sum);
        System.out.println("Sum: "+ calculateSum(a,b));
    }
}