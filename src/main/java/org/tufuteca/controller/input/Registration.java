package org.tufuteca.controller.input;

import org.tufuteca.model.Role;
import org.tufuteca.model.Users;
import org.tufuteca.service.UsersService;

import java.util.Scanner;

public class Registration {

    public void register(Scanner scanner){
        System.out.println("Введите вашу фамилию");
        scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Введите ваше отчество");
        String patronymic = scanner.nextLine();
        System.out.println("Придумайте логин");
        String login = scanner.nextLine();
        String password;
        do {
            System.out.println("Придумайте пароль");
            password = scanner.nextLine();
            System.out.println("Повторите пароль");
            if(scanner.nextLine().equals(password)){
                break;
            }else{
                System.out.println("Ошибка! Пароли не совпадают!");
            }
        }while(true);
        Role role = new Role("USER");
        Users users = new Users(login,password,surname,name,patronymic,role);
        UsersService usersService = new UsersService();
        usersService.addUser(users);
        System.out.println("Пользователь зарегистрирован");
    }

}
