public class AccessModifier {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.username = "Arman";
        //obj.password="123";
        obj.setPassword("123");
       
    }
}
class Bank{
    String username;
    private String password;
    
    void setPassword(String pwd){
        password = pwd;
        //System.out.println(password);
        System.out.println(username);
        
    }
    

}
