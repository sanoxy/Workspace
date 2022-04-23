public class MotherBoard {
    String model;
    public MotherBoard(String model){
        this.model = model;
    }

    class USB{
        int usb2 = 2, usb3 = 1;

        int getTotalPorts(){
            if(MotherBoard.this.model.equals("MSI")){
                return 4;
            }
            else{
                return usb2+usb3;
            }
        }
    }
}
