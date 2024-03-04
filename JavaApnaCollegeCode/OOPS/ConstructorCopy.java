public class ConstructorCopy {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Arman";
        obj1.password = "abcd";
        obj1.roll = 63;
        
        obj1.marks[0] = 100;
        obj1.marks[1] = 90;
        obj1.marks[2] = 80;
        
        Student obj2 = new Student(obj1);
        obj2.password = "32344";
        System.out.println(obj1.name);
        System.out.println(obj2.password);
        obj2.marks[1] = 95;
        for(int i = 0; i< 3; i++){
            System.out.println(obj2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
       System.out.println("called...");
    }

    Student(Student obj1){
        marks = new int[3];
        this.name = obj1.name;
        this.roll = obj1.roll;
        this.marks = obj1.marks;
        this.password = obj1.password;

     }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    // Student(String password){
    //     marks = new int[3];
    //     this.password = password;
    // }
    
    
}
