class Shapes{
    protected final String Shape_Type = "2D";

    double area(){
        return 0;
    }
}

class Polygon extends Shapes{
    @Override
    double area(){
        return -1;
    }
}

class Rectangle extends Polygon{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return length * breadth ;
    }
}

public class ShapeAreaChain {
    public static void main(String[] args){
        Rectangle a = new Rectangle(3,2);
        System.out.println("Shape type: "+a.Shape_Type);
        System.out.println("Area: "+a.area());
    }
}
