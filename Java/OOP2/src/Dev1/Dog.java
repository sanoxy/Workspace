package Dev1;

public class Dog extends Animal{
    String dogType;

    Dog(String name,String dogType){
        super(name);
        this.dogType = dogType;
    }

    void animalSound(){
        System.out.println("Bark!");
    }
}
