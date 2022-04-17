package OOP2;

public class Dog extends Animal{
    public void display(){
        System.out.println("My name is: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
