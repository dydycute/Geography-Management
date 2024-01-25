package controller;

import model.ManageEastAsiaCountries;
import view.Menu;

public class Main extends Menu<String> {

    private final ManageEastAsiaCountries manager;
    private final Handler handler;

    public Main(ManageEastAsiaCountries manager, Handler handler) {
        super("MENU", new String[]{
            "Input the information of 11 countries in East Asia",
            "Display the information of country you've just input",
            "Search the information of country by user-entered name",
            "Display the information of countries sorted name in ascending order",
            "Exit"
        }
        );

        this.manager = manager;
        this.handler = handler;
    }

    @Override
    public void execute(int n) {
        try {
            switch (n) {
                case 1 ->
                    handler.inputInfo(manager);
                case 2 ->
                    handler.displayInput(manager);
                case 3 ->
                    handler.search(manager);
                case 4 ->
                    handler.displayInOrder(manager);
                case 5 ->
                    System.exit(0);
                default ->
                    System.out.println("Invalid selection!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        Handler handler = new Handler();
        Main mainMenu = new Main(manager, handler);
        mainMenu.run();
    }
}
