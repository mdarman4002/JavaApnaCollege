import java.util.Scanner;

public class NumberToRoman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0 || number > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {
            String roman = convertToRoman(number);
            System.out.println("Roman numeral representation: " + roman);
        }

        scanner.close();
    }

    public static String convertToRoman(int number) {
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder roman = new StringBuilder();

        int i = values.length - 1;
        while (number > 0) {
            if (number >= values[i]) {
                roman.append(romanSymbols[i]);
                number -= values[i];
            } else {
                i--;
            }
        }

        return roman.toString();
    }
}
