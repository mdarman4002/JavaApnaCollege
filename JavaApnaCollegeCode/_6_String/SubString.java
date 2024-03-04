public class SubString {
    public static void main(String[] args) {
        String str = "Overcome to think";
        int st = 1;
        int end = 3;
        subString(str, st, 7);
        System.out.println(str.substring(0,7));
    }
    public static void subString(String str, int st, int end){
        String subStr = "";
        for(int i = st; i <= end; i++){
            subStr += str.charAt(i);
        }
        System.out.println("subStr: "+subStr);
    }
}
