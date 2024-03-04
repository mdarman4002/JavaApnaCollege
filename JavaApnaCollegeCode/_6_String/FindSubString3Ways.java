import java.util.*;
public class FindSubString3Ways {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String main = sc.nextLine();

        System.out.println();

        System.out.print("Enter sub string: ");
        String sub = sc.nextLine();

        System.out.println( matchSubString1(main, sub));//.indexOf()
        System.out.println(matchSubString2(main, sub));//.contain()
        System.out.println(matchSubString3(main, sub));;//.matches()
        
    }
    public static boolean matchSubString1(String main, String sub){
        return main.indexOf(sub) != -1;

    }
    public static boolean matchSubString2(String main, String sub){
        return main.contains(sub);

    }
    public static boolean matchSubString3(String main, String sub){
        return main.matches("(.*)" + sub + "(.*)");

    }
}
