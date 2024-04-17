package org.tufuteca.repository;

import org.tufuteca.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    private List<Users> usersList = new ArrayList<>();

    public List<Users> getUsersList(){
        return usersList;
    }
    public void addUser(Users users){
        usersList.add(users);
    }



}
