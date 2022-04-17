package OOP2;

public class Student extends Person{
    public int ID;
    public double grade;
    public String className;

    public Student(String name, String surname, double height, int weight, String sex, String color, int ID, double grade, String className) {
        super(name, surname, height, weight, sex, color);
        this.ID = ID;
        this.grade = grade;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                "} " + super.toString();
    }
}
