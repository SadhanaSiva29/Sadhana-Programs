package inheritance;

public class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle.");
    }

}
class Main{
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape rectangle= new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}