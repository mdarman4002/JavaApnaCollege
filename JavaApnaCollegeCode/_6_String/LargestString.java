import java.util.*;
public class LargestString {

    public static void main(String[] args) {
        String array[] = {"Arman","Ali","Hasnain"}; 
        getLargestString(array);
    }
    public static void getLargestString(String array[]){
        String largest = array[0];

        for(int i = 0; i < array.length; i++){
            if(largest.compareTo(array[i]) < 0){
                largest = array[i];
            }
            //System.out.println("Largest  "+ largest);
        }
        System.out.println("Largest string(Lexicographically): "+ largest);
    }
}


