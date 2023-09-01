public class Inherit {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.color = "green";
        t1.color1();
    }
}

class Shape{
    String color;

    public void color1(){
        System.out.println(color);
    }
}

class Triangle extends Shape{

}
