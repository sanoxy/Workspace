package OOP3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListOfNumbers {
    private int[] list = {5,6,7,8,9,10};

    public void writeList(){
        PrintWriter out = null;

        try {
            System.out.println("Entering Try Statement");
            out = new PrintWriter(new FileWriter("Output.txt"));

            for(int i = 0; i<10; i++){
                 out.println("Value at: " + i + " = " + list[i]);
            }

        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
        finally {
            if(out != null){
                System.out.println("Closing PrintWriter");
                out.close();
            }
            else{
                System.out.println("PrintWriter not open!");
            }
        }

        System.out.println("I'm not dead");
    }
}
