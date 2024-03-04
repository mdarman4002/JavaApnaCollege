public class SetIthPosBit {
    public static void main(String[] args) {
        int num = 8;
        
        System.out.println(num + " into binary: "+Integer.toBinaryString(8));
        int afterFuncCalled = setIthPosBit(num, 2);
       System.out.println("after func calleed: "+afterFuncCalled+" :"+Integer.toBinaryString(afterFuncCalled));
    }
    public static int setIthPosBit(int num, int pos){
        int bitMask = (1 << pos);
        return (num | bitMask);
    }
}
