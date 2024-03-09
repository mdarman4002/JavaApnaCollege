// import java.util.Arrays;
// class Solution {
//     public static void main(String[] args) {
//         int[] arr ={1,2,2,3,3,3};
//         findLucky(arr);
//     }
//     public static void findLucky(int[] arr) {
//         int arrlen = arr.length;
//         int[] frqstore = new int[arrlen];
//         int i;
//         Arrays.sort(arr);
//         int count = 0;
//         for(i = 0; i <= arrlen-2; i++){
//             if(arr[i] == arr[i+1]){
//                 count += 1;
//                 if (arr[i] == arr[arrlen-1]){
//                     count +=1;
//                     frqstore[i] = count;
//                 }
                
//             }
           
//             else if(arr[i] < arr[i+1]){
//                 count +=1;
//                 frqstore[i] = count;
//                 count = 0;

//             }
//         }
//         for(int j:frqstore){
//             System.out.print(j + " ");
//         }
//         System.out.println("2nd loop");
//         for(int k=0; k<frqstore.length; k++){
//             System.out.print(frqstore[k]+" ");
//         }
        
//     }
// }

import java.util.Arrays;

class Solution {
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 2, 3, 3, 3};
    //     findLucky(arr);
    // }

    public int findLucky(int[] arr) {
        int arrlen = arr.length;
        int[] frqstore = new int[arrlen];
        int i;
        Arrays.sort(arr);
        int count = 1; // Initialize count to 1 for the first occurrence of an element

        for (i = 0; i <= arrlen - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                count++; // Increment count for subsequent occurrences of the same element
            } else {
                frqstore[i] = count; // Store the frequency when encountering a new element
                count = 1; // Reset count for the next element
            }
        }


        // Handle the last element separately
        frqstore[arrlen - 1] = count;

        int max = Arrays.stream(frqstore).max().getAsInt();
        return max;

        

        // // Print the contents of frqstore
        // for (int j : frqstore) {
        //     System.out.print(j + " ");
        // }
    }
}
