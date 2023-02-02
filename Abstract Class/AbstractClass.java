//Object cannot be created of abstract class
abstract class Shape{
    int radius;
    void setRadius(int radius){
        this.radius = radius;
    }
    abstract public float area();
}
class Square extends Shape{
    public float area(){
        return radius*radius;
    }
}
class Circle extends Shape{
    public float area(){
        return 3.14f*radius*radius;
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setRadius(3);
        System.out.println("The area of square is "+ sq.area());
        Circle c = new Circle();
        c.setRadius(3);
        System.out.println("The area of square is "+ c.area());
    }
}