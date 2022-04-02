public class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Lamp on? : " + isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Lamp on? : " + isOn);
    }
}
