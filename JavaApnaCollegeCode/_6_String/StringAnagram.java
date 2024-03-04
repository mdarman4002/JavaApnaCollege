import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "a r c";
        String str2 = "c a r";
        
        System.out.println("it's anagram: "+ anagramFunc(str1, str2));
    }
    public static boolean anagramFunc(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String Str1 = str1.replaceAll("\\s", "");
        String Str2 = str2.replaceAll("\\s", "");

        // sorting
        char str1Array[] = Str1.toCharArray();
        char str2Array[] = Str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // comparing sorted arrays
        return (Arrays.equals(str1Array, str2Array));
    }
}
