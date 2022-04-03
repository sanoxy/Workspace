package Old;

public class Country {
    String countryName;
    String countryLanguage;
    int countryPopulation;
    int countryArea;

    //Parameterized Constructor
    public Country(String countryName, String countryLanguage, int countryPopulation, int countryArea) {
        this.countryName = countryName;
        this.countryLanguage = countryLanguage;
        this.countryPopulation = countryPopulation;
        this.countryArea = countryArea;
    }

    //Default Constructor
    public Country(){

    }

    //Copy Constructor
    public Country(Country obj){
        this.countryArea = obj.countryArea;
        this.countryLanguage = obj.countryLanguage;
        this.countryName = obj.countryName;
        this.countryPopulation = obj.countryPopulation;
    }

    @Override
    public String toString() {
        return "Old.Country{" +
                "countryName='" + countryName + '\'' +
                ", countryLanguage='" + countryLanguage + '\'' +
                ", countryPopulation=" + countryPopulation +
                ", countryArea=" + countryArea +
                '}';
    }
}
