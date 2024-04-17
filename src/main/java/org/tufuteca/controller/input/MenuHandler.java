package org.tufuteca.controller.input;

import org.tufuteca.controller.output.MenuView;
import org.tufuteca.util.InputValidation;

import java.util.Scanner;

public class MenuHandler {

    private final MenuView menuView = new MenuView();
    private final Scanner scanner = new Scanner(System.in);
    private final InputValidation inputValidation = new InputValidation();

    public void authOrRegMenuHandler(){
        Registration registration = new Registration();
        Authorization authorization = new Authorization();
        boolean validChoice;
        do {
            menuView.displayAuthOrRegMenu();
            int choice = inputValidation.integerInput(scanner);
            validChoice = true;
            switch (choice){
                case 1:
                    authorization.auth(scanner);
                    break;
                case 2:
                    registration.register(scanner);
                    authOrRegMenuHandler();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Пункта в меню с таким номером нет. Введите ещё раз");
                    validChoice = false;
            }
        } while (!validChoice);
    }


    public void userMenuHandler(){
        menuView.diplayUserMenu();

    }

    public void adminMenuHandler(){
        menuView.diplayAdminMenu();

    }
}
