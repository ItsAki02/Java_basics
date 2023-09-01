public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akanksha";
        s1.age = 23;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.age = s2.age;
        this.name = s2.name;
    }
    Student(){
        
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}