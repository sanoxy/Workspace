package Old;

public class Engineer extends Person{
    String department;

    public Engineer(String name, String surname, int ID, int age, String department) {
        super(name, surname, ID, age);
        this.department = department;
    }

    public Engineer(){

    }

    public Engineer(Engineer engineer){
        this.department = engineer.department;
        this.age = engineer.age;
        this.ID = engineer.ID;
        this.surname = engineer.surname;
        this.name = engineer.name;
    }

    @Override
    public String toString() {
        return "Old.Engineer{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }
}
