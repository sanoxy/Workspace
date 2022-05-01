package Dev;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Operations {

    public static void addStudent(LinkedList<Student> students) {
        System.out.println("-----------ADD STUDENT-----------");
        Student student = new Student();
        Scanner inputTaker = new Scanner(System.in);

        System.out.print("Name: ");
        student.setName(inputTaker.nextLine());

        System.out.print("School: ");
        student.setSchool(inputTaker.nextLine());

        System.out.print("Address: ");
        student.setAddress(inputTaker.nextLine());

        System.out.print("City: ");
        student.setCity(inputTaker.nextLine());

        System.out.print("County: ");
        student.setCounty(inputTaker.nextLine());

        System.out.print("Postal: ");
        student.setPostal(inputTaker.nextLine());

        System.out.print("email: ");
        student.setEmail(inputTaker.nextLine());

        System.out.print("ID: ");
        student.setID(inputTaker.nextInt());

        students.add(student);
        System.out.println("---------------STUDENT HAS BEEN ADDED SUCCESSFULLY!---------------");
    }

    public static void removeStudent(LinkedList<Student> students) {
        System.out.println("-----------REMOVE STUDENT-----------");
        System.out.print("ID: ");
        Scanner inputTaker = new Scanner(System.in);
        int ID = inputTaker.nextInt();

        if(students.removeIf(current -> ID == current.getID())){
            System.out.println("---------------STUDENT HAS BEEN REMOVED SUCCESSFULLY!---------------");
            return;
        }
        System.out.println("---------------STUDENT CANNOT BE FOUND!---------------");

    }

    public static void updateStudent(LinkedList<Student> students) {
        System.out.println("-----------UPDATE STUDENT-----------");

        System.out.print("ID: ");
        Scanner inputTaker = new Scanner(System.in);
        int ID = inputTaker.nextInt();
        inputTaker.nextLine();

        for (Student current : students){
            if (ID == current.getID()){
                System.out.print("Name: ");
                current.setName(inputTaker.nextLine());

                System.out.print("School: ");
                current.setSchool(inputTaker.nextLine());

                System.out.print("Address: ");
                current.setAddress(inputTaker.nextLine());

                System.out.print("City: ");
                current.setCity(inputTaker.nextLine());

                System.out.print("County: ");
                current.setCounty(inputTaker.nextLine());

                System.out.print("Postal: ");
                current.setPostal(inputTaker.nextLine());

                System.out.print("email: ");
                current.setEmail(inputTaker.nextLine());

                System.out.print("ID: ");
                current.setID(inputTaker.nextInt());
                System.out.println("---------------STUDENT HAS BEEN UPDATED SUCCESSFULLY!---------------");
                return;
            }
        }
        System.out.println("---------------STUDENT CANNOT BE FOUND!---------------");
    }

    public static void searchStudent(LinkedList<Student> students) {
        System.out.println("-----------SEARCH STUDENT-----------");

        System.out.print("ID: ");
        Scanner inputTaker = new Scanner(System.in);
        int ID = inputTaker.nextInt();

        for (Student current : students){
            if (ID == current.getID()){
                System.out.println(current);
                System.out.println("---------------STUDENT HAS BEEN FOUND!---------------");
                return;
            }
        }

        System.out.println("---------------STUDENT CANNOT BE FOUND!---------------");
    }

    public static void listSchool(LinkedList<Student> students) {
        System.out.println("-----------LIST BY SCHOOL-----------");

        System.out.print("School: ");
        Scanner inputTaker = new Scanner(System.in);
        String school = inputTaker.nextLine();

        for (Student current : students){
            if (school.equals(current.getSchool())){
                System.out.println(current);
            }
        }
        System.out.println("----------------------------------");

    }

    public static void listCity(LinkedList<Student> students) {
        System.out.println("-----------LIST BY CITY-----------");

        System.out.print("City: ");
        Scanner inputTaker = new Scanner(System.in);
        String city = inputTaker.nextLine();

        for (Student current : students){
            if (city.equals(current.getCity())){
                System.out.println(current);
            }
        }
        System.out.println("----------------------------------");

    }

    public static void listCounty(LinkedList<Student> students) {
        System.out.println("-----------LIST BY COUNTY-----------");

        System.out.print("County: ");
        Scanner inputeTaker = new Scanner(System.in);
        String county = inputeTaker.nextLine();

        for (Student current : students){
            if (county.equals(current.getCounty())){
                System.out.println(current);
            }
        }
        System.out.println("----------------------------------");

    }

    public static void terminate(LinkedList<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter("output.csv");
        fileWriter.write("student_name;school_name;address;city;county;postal;id;email\n");

        for(Student student : students){
            String result = student.getName() + ";" + student.getSchool() + ";" + student.getAddress()
                    + ";" + student.getCity() + ";" + student.getCounty() + ";" + student.getPostal()
                    + ";" + student.getID() + ";" + student.getEmail() + "\n";

            fileWriter.write(result);
        }
        fileWriter.close();
        System.out.println("Successfully wrote to output.csv file!");
        System.exit(-1);
    }
}
