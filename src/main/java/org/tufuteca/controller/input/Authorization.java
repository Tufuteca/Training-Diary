package org.tufuteca.controller.input;

import org.tufuteca.service.UsersService;

import java.util.Scanner;

public class Authorization {

    public void auth(Scanner scanner){
        UsersService usersService = new UsersService();
        MenuHandler menuHandler = new MenuHandler();
        System.out.println("Введите логин");
        scanner.nextLine();
        String username = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        if(username.equals("admin") && password.equals("admin")){
            menuHandler.adminMenuHandler();
        }else{
            String getUser = usersService.authenticateUser(username,password);
            if(getUser.equals("USER")){
                menuHandler.userMenuHandler();
            } else if (getUser.equals("ADMIN")) {
                menuHandler.adminMenuHandler();
            }else{
                System.out.println("Пользователь с таким логином или паролем не найден");
                menuHandler.authOrRegMenuHandler();
            }
        }
    }

}
