package Old;

public class Person {
    String name, surname;
    int ID;
    int age;

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
}
