interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON."); }
    public void turnOff() { System.out.println("Light turned OFF."); }
}

class AirConditioner implements SmartDevice {
    public void turnOn() { System.out.println("AC started cooling."); }
    public void turnOff() { System.out.println("AC stopped."); }
}

class Television implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON."); }
    public void turnOff() { System.out.println("TV is OFF."); }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice tv = new Television();
        SmartDevice ac = new AirConditioner();

        tv.turnOn();
        ac.turnOff();
    }
}

