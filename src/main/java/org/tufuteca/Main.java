package org.tufuteca;


import org.tufuteca.controller.input.MenuHandler;
import org.tufuteca.repository.UsersRepository;
import org.tufuteca.service.UsersService;

public class Main {
    public static final UsersRepository usersRepository = new UsersRepository();
    public static void main(String[] args) {

        MenuHandler menuHandler = new MenuHandler();
        menuHandler.authOrRegMenuHandler();
    }
}