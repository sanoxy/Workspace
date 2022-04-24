package OOP3;

public class CPU {
    double price;

    //nested class
    class Processor {
        double cores = 2;
        String manufacturer;

        double getCache() {
            return cores * 4.3;
        }
    }

    //nested protected class
    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 3200.0;
        }
    }
}
