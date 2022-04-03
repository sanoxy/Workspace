package New;

public class Person {
    private String name, surname;
    private int ID;
    private int age;

    //Copy Constructor
    public Person(Person obj){
        this.name = obj.name;
        this.age = obj.age;
        this.ID = obj.ID;
        this.surname = obj.surname;
    }

    //Default Constructor
    public Person(){

    }

    //Parameterized Constructor
    public Person(String name, String surname, int ID, int age) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Old.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
