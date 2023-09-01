public class OOps{
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student("Riya", 22);
        

        s1.printInfo();
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }
// }