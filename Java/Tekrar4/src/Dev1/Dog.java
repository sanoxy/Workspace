package Dev1;

public class Dog {
    String name;
    String type;
    String color;
    int age;
    int weight;

    Dog(){
        name = "Kont";
        type = "wolf";
        color = "brown";
        age = 6;
        weight = 25;
    }

    Dog(String name, String type, String color, int age, int weight){
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    Dog(Dog obj){
        this.name = obj.name;
        this.type = obj.type;
        this.color = obj.color;
        this.age = obj.age;
        this.weight = obj.weight;
    }

    void eat(){
        System.out.println("I can eat");
    }
    void sleep(){
        System.out.println("I can sleep");
    }
    void bark(){
        System.out.println("I can bark");
    }

    void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
    }
}
