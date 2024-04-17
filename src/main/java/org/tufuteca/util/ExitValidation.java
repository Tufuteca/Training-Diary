package org.tufuteca.util;

import org.tufuteca.controller.input.MenuHandler;

import java.util.Scanner;

public class ExitValidation {

    private MenuHandler menuHandler = new MenuHandler();

    public void exitFromAccount(Scanner scanner, String userRole) {
        InputValidation inputValidation = new InputValidation();
        System.out.println("Вы уверены что хотите выйти?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        switch (inputValidation.integerInput(scanner)) {
            case 1:
                menuHandler.authOrRegMenuHandler();
            case 2:
                if (userRole.equals("ADMIN")) {
                    menuHandler.adminMenuHandler();
                } else if (userRole.equals("USER")) {
                    menuHandler.userMenuHandler();
                } else {
                    System.out.println("Ошибка. Пожалуйста войдите в учетную запись ещё раз");
                }
            default:
                System.out.println("Такого пункта меню нет. Выберите снова");
                exitFromAccount(scanner);
        }
    }


        public void exitFromApplication(Scanner scanner){
            InputValidation inputValidation = new InputValidation();
            System.out.println("Вы уверены что хотите выйти?");
            System.out.println("1. Да");
            System.out.println("2. Нет");
            switch (inputValidation.integerInput(scanner)){
                case 1:
                    System.exit(0);
                case 2:
                    menuHandler.authOrRegMenuHandler();
                default:
                    System.out.println("Такого пункта меню нет. Выберите снова");
                    exitFromApplication(scanner);
            }
    }

}
