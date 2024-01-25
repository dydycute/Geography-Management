package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManageEastAsiaCountries {

    private List<EastAsiaCountries> countryList;

    public ManageEastAsiaCountries() {
        this.countryList = new ArrayList<>();
    }

    // Function 1: Add information for a country
    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        if (country.getTotalArea() <= 0) {
            throw new Exception("Total area must be greater than 0.");
        }
        countryList.add(country);
    }

    // Function 2: Display information of countries you’ve just input
    public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
        if (countryList.isEmpty()) {
            throw new Exception("No information available.");
        }
        return countryList.get(countryList.size() - 1);
    }

    // Function 3: Search information of countries by user-entered name
    public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
        List<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries country : countryList) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                result.add(country);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("Country not found.");
        }
        return result.toArray(EastAsiaCountries[]::new);
    }

    // Function 4: Displays the names of countries by name ascending
    public EastAsiaCountries[] sortInformation() throws Exception {
        if (countryList.isEmpty()) {
            throw new Exception("No information available.");
        }
        countryList.sort(Comparator.comparing(EastAsiaCountries::getCountryName));
        return countryList.toArray(EastAsiaCountries[]::new);
    }
}
