public class JavaBasic{
    public static void main(String args[]){

        int age = 16;
        
        if (age >= 18){
            System.out.println("You are eligible");
        }
        if (17 <= age && age<= 12){
            System.out.println("Your age is under 18 and above 12");
        }
        else{
            System.out.println("You are child");
        }

    }
}