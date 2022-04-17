package Dev1;

public class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Dev1.Lamp is ON!");
    }

    void turnOff(){
        isOn = false;
        System.out.println("Dev1.Lamp is OFF");
    }
}
