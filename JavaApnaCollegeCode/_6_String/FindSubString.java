import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mainStr = sc.nextLine();

        System.out.println();

        System.out.print("Enter sub string: ");
        String sub = sc.nextLine();

        System.out.println("Sub string found at index: " + stringSearch(mainStr, sub));
    }

    public static int stringSearch(String mainStr, String sub) {
        int lengthMainStr = mainStr.length(); // m --> (m+1)-n
        int lengthSub = sub.length(); // n --> n

        for (int i = 0; i <= lengthMainStr - lengthSub; i++) {
            boolean assumed = true;
            for (int j = 0; j < lengthSub; j++) {
                if (mainStr.charAt(i + j) != sub.charAt(j)) {
                    assumed = false;
                    break;
                }
            }
            if (assumed) { //  if assumed is still true
                return i;
            }
        }
        return -1;
    }
}
