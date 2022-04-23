package Dev1;

public class Puppy extends Dog {
    public int weight;

    Puppy(String name, String dogType, int weight) {
        super(name, dogType);
        this.weight = weight;
    }

    void animalSound(){
        System.out.println("Dev1.Puppy");
    }
}
