package Interfaces;

public class SpeakingLanguage implements Languages{
    @Override
    public void getName(String name) {
        System.out.println("Speaking Language: " + name);
    }
}
