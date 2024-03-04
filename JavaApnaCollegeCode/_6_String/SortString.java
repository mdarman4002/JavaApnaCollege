import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {
        String str = "sklfdhbfsfndffwofisosaaoja";
        sorting(str);
    }
    public static void sorting(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
