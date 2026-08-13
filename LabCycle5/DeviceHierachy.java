class Device{
    final void powerOn(){
        System.out.println("Power on");
    }
}

class Phone extends Device{
    void call(String number){
        System.out.println("Number: "+number);
    }
    void installApp(String name){
        System.out.println("Name: "+name);
    }
}

class Smartphone extends Phone{
    @Override
    void installApp(String name){
        System.out.println("Name: "+name);
    }
}

public class DeviceHierachy {
    public static void main(String[] args){
        Smartphone s = new Smartphone();

        s.powerOn();
        s.call("8848874831");
        s.installApp("WhatsApp");
    }
}
