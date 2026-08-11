class Person{
    protected String name;
    protected int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    private int rollNo;
    private double marks;

    Student(String name, int age, int rollNo, double marks){
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}

public class StudentRecord {
    public static void main(String[] args){
        Student s = new Student("Riya", 22, 48, 75.25);
        s.display();
    }
}
