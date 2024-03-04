public class ClearNthBit {
    public static void main(String[] args) {
       func(10, 1);
    }
    public static void func(int num, int i){
        int bitMask = (1 << i);
        System.out.println(num ^ bitMask);
        int rep = ~(1 << i);
        System.out.println(num & rep);
        // System.out.println("rep: "+ rep);
        // System.out.println(Integer.toBinaryString(rep));
        
        // System.out.println("size of the bit: "+Integer.toBinaryString(rep).length());
    }
}
