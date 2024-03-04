public class GetIthPosBit{
    public static void main(String[] args) {
       // getIthPosBit(20, 4);
        System.out.println(getIthPosBit(8, 4));
    }
    public static int getIthPosBit(int num, int pos){
        //int bitMask = 1 << pos;
        if ((num & (1 << pos)) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}