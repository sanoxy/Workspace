package Dev;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Student> students = new LinkedList<Student>();
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);

        scanner.nextLine();
        while(scanner.hasNextLine()){
            String readLine = scanner.nextLine();
            String[] splittedLine = readLine.split(";");

            String name = splittedLine[0];
            String school = splittedLine[1];
            String address = splittedLine[2];
            String city = splittedLine[3];
            String county = splittedLine[4];
            String postal = splittedLine[5];
            int ID = Integer.parseInt(splittedLine[6]);
            String email = splittedLine[7];

            Student student = new Student(name,school,address,city,county,postal,ID,email);
            students.add(student);
        }

        while(true){
            menu();
        }
    }

    static void menu() throws IOException {
        System.out.println("1. Add Student");
        System.out.println("2. Remove student");
        System.out.println("3. Update student");
        System.out.println("4. Search student");
        System.out.println("5. List by school");
        System.out.println("6. List by city");
        System.out.println("7. List by county");
        System.out.println("8. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 -> Operations.addStudent(students);
            case 2 -> Operations.removeStudent(students);
            case 3 -> Operations.updateStudent(students);
            case 4 -> Operations.searchStudent(students);
            case 5 -> Operations.listSchool(students);
            case 6 -> Operations.listCity(students);
            case 7 -> Operations.listCounty(students);
            case 8 -> Operations.terminate(students);
            default -> menu();
        }
    }
}
