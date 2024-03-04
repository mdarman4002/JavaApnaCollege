import java.util.HashMap;
public class StringCharCount {
    public static void main(String[] args) {
        String str = "Arman";
        getCharCount(str);
        getCharCount("I am Indian ");
        getCharCount("I belong to Bihar");
        getCharCount("testing performing test");
        
    }
    public static void getCharCount(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char strArray[] = str.toCharArray();
        // used each loop
        try{
            for(char i : strArray){
                if(hashMap.containsKey(i)){
                    hashMap.put(i,(hashMap.get(i)+1));
                }
                else{
                    hashMap.put(i,1);
                }
            }
            System.out.println("char: "+ hashMap);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
