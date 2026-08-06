class A{
    void show(){
        System.out.println("Show from base class A.");
    }
}

class B extends A{
    void show(){
        System.out.println("Show from derived class B.");
    }
}

class C extends B{
    void show(){
        System.out.println("Show from derived class C.");
    }
}


class Demo{
    public static void main(String[] args){
        A obj = new B();  // runtime polymorphism
        obj = new C();
        // C obj  = new C();
        obj.show();
    }
}