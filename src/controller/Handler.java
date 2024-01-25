package controller;

import model.EastAsiaCountries;
import model.ManageEastAsiaCountries;

import java.util.Scanner;

public class Handler {

    public void inputInfo(ManageEastAsiaCountries manager) {
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("Enter information for Country " + (i + 1));
                System.out.print("Country Code: ");
                String code = scanner.nextLine();
                System.out.print("Country Name: ");
                String name = scanner.nextLine();
                System.out.print("Total Area: ");
                float area = Float.parseFloat(scanner.nextLine());
                System.out.print("Terrain: ");
                String terrain = scanner.nextLine();

                EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
                manager.addCountryInformation(country);
            }
            System.out.println("Information added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayInput(ManageEastAsiaCountries manager) {
        try {
            EastAsiaCountries country = manager.getRecentlyEnteredInformation();
            System.out.println("Recently Entered Information:");
            country.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void search(ManageEastAsiaCountries manager) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name to search: ");
        String name = scanner.nextLine();

        try {
            EastAsiaCountries[] result = manager.searchInformationByName(name);
            System.out.println("Search Results:");
            for (EastAsiaCountries country : result) {
                country.display();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayInOrder(ManageEastAsiaCountries manager) {
        try {
            EastAsiaCountries[] sortedList = manager.sortInformation();
            System.out.println("Countries Sorted by Name in Ascending Order:");
            for (EastAsiaCountries country : sortedList) {
                country.display();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
