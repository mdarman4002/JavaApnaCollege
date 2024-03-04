public class Constructor {
    public static void main(String[] args) {
        Const obj1 = new Const();
        Const obj2 = new Const("Arman",63);
        System.out.println("name: "+obj2.name + ", roll: "+ obj2.roll);
        
    }
}
class Const{
    String name;
    int roll;
    Const(){  // non-parametrize
        System.out.println("Constructor called...");
    }
    Const(String name, int roll){  // parametrize constructor
        this.name = name;
        this.roll = roll;
    }
}
