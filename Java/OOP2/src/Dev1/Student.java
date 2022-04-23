package Dev1;

public class Student extends Person{
    String department;
    int ID;
    double GPA;

    public Student(String name, String surname, int age,
                   String department, int ID, double GPA) {
        super(name, surname, age);
        this.department = department;
        this.ID = ID;
        this.GPA = GPA;
    }
}
