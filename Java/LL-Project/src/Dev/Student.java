package Dev;

public class Student {
    private String name;
    private String school;
    private String address;
    private String city;
    private String county;
    private String postal;
    private int ID;
    private String email;

    public Student(String name, String school, String address, String city, String county, String postal, int ID, String email) {
        this.name = name;
        this.school = school;
        this.address = address;
        this.city = city;
        this.county = county;
        this.postal = postal;
        this.ID = ID;
        this.email = email;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postal='" + postal + '\'' +
                ", ID=" + ID +
                ", email='" + email + '\'' +
                '}';
    }
}
