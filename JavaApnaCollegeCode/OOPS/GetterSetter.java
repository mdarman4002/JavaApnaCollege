public class GetterSetter {
    public static void main(String[] args) {
        Pen obj=new Pen();
        obj.setColor("Blue");
        obj.setTip(10);
        System.out.println(obj.getColor());
        System.out.println(obj.getTip());
        
    }
}
class Pen{
    private String color;
    private int tip;
    
    
    public String getColor(){
        return color;
    }
    
    public int getTip(){
        return tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    
}


