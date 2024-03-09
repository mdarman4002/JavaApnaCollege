public class _6_ElementOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,3,11,9};
        System.out.println(isOccured(arr, 9,0));
    }
    public static int isOccured(int[] arr, int key, int i){
        if(arr.length == i){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return isOccured(arr, key, i+1);
        
    }
}
