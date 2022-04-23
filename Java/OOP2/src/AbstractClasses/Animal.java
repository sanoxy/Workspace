package AbstractClasses;

abstract class Animal {
    abstract void makeSound();
    String name;

    Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat");
    }
}
