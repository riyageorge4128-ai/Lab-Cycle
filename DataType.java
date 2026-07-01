import java.util.Scanner;

public class DataType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 100;
        long b = 100000;
        float c = 25.5f;
        double d = 123.456;
        char e = 'A';
        boolean f = true;

        System.out.println("Integer value : " + a);
        System.out.println("Range         : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Long value    : " + b);
        System.out.println("Range         : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Float value   : " + c);
        System.out.println("Range         : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("Double value  : " + d);
        System.out.println("Range         : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Character     : " + e);
        System.out.println("Range         : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("Boolean       : " + f);
        System.out.println("Values        : true or false");

    }
}
