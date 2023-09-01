public class TypesOfnheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}

class Shape{
  
    public void area(){
        System.out.println("displays area");
    }
}
//single level
class Triangle extends Shape{
    public void area(int l ,int h){
        System.out.println(1/2*l*h);
    }
}
//multilevel
class Equilateral extends Triangle{
    public void area(int l ,int h){
        System.out.println(1/2*l*h);
    }
}

//hierarchical 
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}