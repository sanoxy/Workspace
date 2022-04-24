package OOP3;

public class Test {
    Size pizzaSize;

    public Test(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza(){
        switch (pizzaSize){
            case SMALL ->{
                System.out.println("I ordered small size pizza");
            }
            case MEDIUM -> {
                System.out.println("I ordered medium size pizza!");
            }
            default -> {
                System.out.println("I dont know which one to order!");
            }
        }
    }
}
