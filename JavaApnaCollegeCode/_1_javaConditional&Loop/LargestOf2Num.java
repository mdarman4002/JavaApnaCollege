import java.util.*;
public class LargestOf2Num {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        a = sc.nextInt();
        System.out.println("Enter B: ");
        b = sc.nextInt();

        if (a > b){
            System.out.println("A is greater");
        }
        if (b > a){
            System.out.println("B is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
