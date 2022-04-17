package Dev1;

public class Student {
    public String name;
    public String surname;
    public int ID;
    public double grade;
    public String className;

    //Default
    public Student() {
        name = "NULL";
        surname = "NULL";
        ID = 0;
        grade = 0.0;
        className = "X";
    }

    //Parameterized Constructor!
    Student(String name, String surname, int ID, double grade, String className) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.grade = grade;
        this.className = className;
    }

    Student(Student obj){
        this.name = obj.name;
        this.surname = obj.surname;
        this.ID = obj.ID;
        this.grade = obj.grade;
        this.className = obj.className;
    }

    public void printInfo() {
        System.out.println("Dev1.Student name : " + name);
        System.out.println("Dev1.Student surname : " + surname);
        System.out.println("Dev1.Student ID :" + ID);
        System.out.println("Dev1.Student garde : " + grade);
        System.out.println("Dev1.Student classname : " + className);
    }

    void study() {
        System.out.println("Dev1.Student is working!");
    }

    void takeExam() {
        System.out.println("Dev1.Student is taking exam");
    }
}
