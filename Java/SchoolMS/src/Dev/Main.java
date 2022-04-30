package Dev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dev.LinkedList<Student> studentList = new Dev.LinkedList<>();
        File file = new File(args[0]);
//        System.out.println("Name: " + file.getName());
//        System.out.println("Path: " + file.getAbsolutePath());
//        System.out.println("Size: " + file.length());

        try {
            Scanner reader = new Scanner(file);
            reader.nextLine();
            while(reader.hasNextLine()){
                String readLine = reader.nextLine();
                String[] splittedData = readLine.split(",");

                String name = splittedData[0];
                String school = splittedData[1];
                String address =  splittedData[2];
                String city = splittedData[3];
                String county = splittedData[4];
                String postal = splittedData[5];
                String phone = splittedData[6];
                String email = splittedData[7];

                Student student = new Student(name,school,address,city,county,postal,phone,email);
                studentList.append(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean exit = false;

        do {
            Scanner scanner = new Scanner(System.in);
            menu();
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 ->{
                    Operations.addStudent(studentList);
                }
                case 2 ->{
                    Operations.removeStudent(studentList);
                }
                case 3 ->{
                    Operations.showStudent(studentList);
                }
                case 4 ->{
                    Operations.updateStudent(studentList);
                }
                case 5 ->{
                    Operations.findBySchool(studentList);
                }
                case 6 ->{
                    Operations.findByCity(studentList);
                }
                case 7 ->{
                    Operations.findByCounty(studentList);
                }
                case 8 ->{
                    exit = true;
                }
            }
        }while(!exit);
    }

    static void menu(){
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Show Student");
        System.out.println("4. Update Student");
        System.out.println("5. Find Students in Same School");
        System.out.println("6. Find Students in Same City");
        System.out.println("7. Find Students in Same County");
        System.out.println("8. Exit");
    }
}
