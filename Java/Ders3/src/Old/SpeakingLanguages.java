package Old;

public class SpeakingLanguages implements Languages{

    @Override
    public void getName(String name) {
        System.out.println("Best speaking language is " + name);
    }
}
