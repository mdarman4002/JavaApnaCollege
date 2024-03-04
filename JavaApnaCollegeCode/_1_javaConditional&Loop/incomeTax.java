import java.util.Scanner;
public class incomeTax {
    public static void main(String args[]){
        int tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly income");
        int income = sc.nextInt();

        if (income <= 350000){
            System.out.println("No tax");
        }
        else if (income <= 1500000 && income > 350000){
            tax = (int)(income * .15);
            System.out.println("You have to pay tax: "+ tax);
        }
        else{
            tax = (int) (income * .30);
            System.out.println("You have to pay tax: "+ tax);
        }
    }
}
