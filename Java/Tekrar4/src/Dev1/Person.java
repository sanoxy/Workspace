package Dev1;

public class Person {
    private String name;
    private String surname;
    private double height;
    private int weight;
    private String sex;
    private String color;

    Person(){
        name = "NULL";
        surname = "NULL";
        height = 0;
        weight = 0;
        sex = "NULL";
        color = "NULL";
    }

    //Copy Constructor
    Person(Person obj){
        this.name = obj.name;
        this.surname = obj.surname;
        this.sex = obj.sex;
        this.color = obj.color;
        this.height = obj.height;
        this.weight = obj.weight;
    }

    public Person(String name, String surname, double height, int weight, String sex, String color) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Sex : " + sex);
        System.out.println("Color : " + color);
    }
}
