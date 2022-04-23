package Interfaces;

public class ProgrammingLanguages implements Languages {

    @Override
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}
