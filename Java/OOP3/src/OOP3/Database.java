package OOP3;

public class Database {
    private static Database dbObject;

    private Database(){

    }

    public static Database getInstance(){
        if(dbObject == null)
            dbObject = new Database();
        else
            System.out.println("ERROR");

        return dbObject;
    }

    public void getConnection(){
        System.out.println("You are now connected to the DB");
    }
}
