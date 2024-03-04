public class LetterToUpperCase {
    public static void main(String[] args) {
        String str = "i am mohammad arman";
        System.out.println(toUpperCase(str));
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) ==' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        // System.out.println("new String: "+sb);
    }
}
