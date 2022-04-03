package Old;

public class Student {
    String name, surname;
    int age;
    int ID;
    int className;

    public Student(String name, String surname, int age, int ID, int className){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ID = ID;
        this.className = className;
    }

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Student(){

    }

    public Student(Student obj){
        this.name = obj.name;
        this.surname = obj.surname;
        this.age = obj.age;
        this.ID = obj.ID;
        this.className = obj.className;
    }

    @Override
    public String toString() {
        return "Old.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", className=" + className +
                '}';
    }
}
