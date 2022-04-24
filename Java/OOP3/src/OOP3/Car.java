package OOP3;

public class Car {
    private String carType;
    private String carName;

    public Car(String carType, String carName) {
        this.carType = carType;
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    class Engine{
        String engineType;

        void setEngine(){
            if(carName.equals("Mercedes") && carType.equals("Automobile")){
                engineType = "V6";
            }
            else if(carName.equals("Mercedes") && carType.equals("Bus")){
                engineType = "V8";
            }
            else if(carName.equals("Mercedes") && carType.equals("Truck")){
                engineType = "V12";
            }
            else{
                engineType = "V4";
            }
        }

        String getEngine(){
            return this.engineType;
        }
    }
}
