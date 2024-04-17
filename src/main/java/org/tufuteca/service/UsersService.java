package org.tufuteca.service;

import org.tufuteca.Main;
import org.tufuteca.model.Users;
import org.tufuteca.repository.UsersRepository;

import java.util.List;

public class UsersService {

    private final UsersRepository usersRepository = Main.usersRepository;

    public void addUser(Users users){
        usersRepository.addUser(users);
    }
    public List<Users> getUsersList(){
        return usersRepository.getUsersList();
    }
    public String authenticateUser(String username, String password){
        for(Users user: getUsersList()){
            if(user.getUsername() != null && user.getPassword() != null
                    && user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user.getRole().getTitle();
            }
        }
        return "";
    }

}
