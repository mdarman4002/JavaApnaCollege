import java.util.*;
public class Concate{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String inp_1 = sc.nextLine();

        System.out.println();

        System.out.print("Enter 2nd string: ");
        String inp_2 = sc.nextLine();

        concateFunc(inp_1, inp_2);
    }
    public static void concateFunc(String inp_1,String inp_2){
        System.out.println("after concate: "+ (inp_1 + inp_2));
    }
}   