package model;

public class EastAsiaCountries extends Country {

    private String countryTerrain;

    // Constructor with parameters using super keyword
    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Country Terrain: " + countryTerrain);
    }
}
