package Dev;

import java.util.Scanner;

public class Operations {
    public static void addStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("School: ");
        String school = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("County: ");
        String county = scanner.nextLine();

        System.out.print("Postal: ");
        String postal = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("E-Mail: ");
        String email = scanner.nextLine();

        Student student = new Student(name,school,address,city,county,postal,phone,email);
        studentList.append(student);

        System.out.println("Student has been added successfully!\n");
    }

    public static void removeStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number of student: ");
        String number = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getPhone().equals(number)){
                studentList.delete(currentStudent);
                System.out.println("Student has been removed successfully!\n");
                return;
            }
        }
        System.out.println("Student cannot be found!\n");
    }

    public static void showStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number of student: ");
        String number = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getPhone().equals(number)){
                System.out.println("Name: " + currentStudent.getName());
                System.out.println("School: " + currentStudent.getSchool());
                System.out.println("Address: " + currentStudent.getAddress());
                System.out.println("City: " + currentStudent.getCity());
                System.out.println("County: " + currentStudent.getCounty());
                System.out.println("Postal: " + currentStudent.getPostal());
                System.out.println("Phone: " + currentStudent.getPhone());
                System.out.println("Email: " + currentStudent.getEmail() +"\n");

                return;
            }
        }
        System.out.println("Student has been added successfully!\n");

    }

    public static void updateStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number of student: ");
        String number = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getPhone().equals(number)){

                System.out.print("Name: ");
                currentStudent.setName(scanner.nextLine());

                System.out.print("School: ");
                currentStudent.setSchool(scanner.nextLine());

                System.out.print("Address: ");
                currentStudent.setAddress(scanner.nextLine());

                System.out.print("City: ");
                currentStudent.setCity(scanner.nextLine());

                System.out.print("County: ");
                currentStudent.setCounty(scanner.nextLine());

                System.out.print("Postal: ");
                currentStudent.setPostal(scanner.nextLine());

                System.out.print("Phone: ");
                currentStudent.setPhone(scanner.nextLine());

                System.out.print("E-Mail: ");
                currentStudent.setEmail(scanner.nextLine());

                System.out.println("Student information has been updated!");
                return;
            }
        }
        System.out.println("Student cannot be found!\n");
    }

    public static void findByCity(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getCity().equals(city)){

                System.out.println("Name: " + currentStudent.getName());
                System.out.println("School: " + currentStudent.getSchool());
                System.out.println("Address: " + currentStudent.getAddress());
                System.out.println("City: " + currentStudent.getCity());
                System.out.println("County: " + currentStudent.getCounty());
                System.out.println("Postal: " + currentStudent.getPostal());
                System.out.println("Phone: " + currentStudent.getPhone());
                System.out.println("Email: " + currentStudent.getEmail());
                System.out.println("--------------------------------------------");
                return;
            }
        }
    }

    public static void findBySchool(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter School: ");
        String school = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getSchool().equals(school)){

                System.out.println("Name: " + currentStudent.getName());
                System.out.println("School: " + currentStudent.getSchool());
                System.out.println("Address: " + currentStudent.getAddress());
                System.out.println("City: " + currentStudent.getCity());
                System.out.println("County: " + currentStudent.getCounty());
                System.out.println("Postal: " + currentStudent.getPostal());
                System.out.println("Phone: " + currentStudent.getPhone());
                System.out.println("Email: " + currentStudent.getEmail());
                System.out.println("--------------------------------------------");

                return;
            }
        }
    }

    public static void findByCounty(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter County: ");
        String county = scanner.nextLine();

        for(int i = 0; i< studentList.size(); i++){
            Student currentStudent = studentList.get(i);
            if(currentStudent.getCounty().equals(county)){

                System.out.println("Name: " + currentStudent.getName());
                System.out.println("School: " + currentStudent.getSchool());
                System.out.println("Address: " + currentStudent.getAddress());
                System.out.println("City: " + currentStudent.getCity());
                System.out.println("County: " + currentStudent.getCounty());
                System.out.println("Postal: " + currentStudent.getPostal());
                System.out.println("Phone: " + currentStudent.getPhone());
                System.out.println("Email: " + currentStudent.getEmail());
                System.out.println("--------------------------------------------");

                return;
            }
        }
    }
}
