public class _7_LastOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,8,2};
        System.out.println(lastOccurence(arr, 2, 0));
    }
    public static int lastOccurence(int arr[], int key, int i){
        if(arr.length == i){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return isFound;
    }
}
