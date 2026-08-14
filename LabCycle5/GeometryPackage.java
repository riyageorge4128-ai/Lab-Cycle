import geometry.*;

public class GeometryPackage {
    public static void main(String[] args){
        Square s = new Square(4);
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Square area: " + s.area());
        System.out.println("Square perimeter: " + s.perimeter());

        System.out.println("Triangle area: " + t.area());
        System.out.println("Triangle perimeter: " + t.perimeter());
    }
}
