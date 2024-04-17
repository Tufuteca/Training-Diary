package org.tufuteca.repository;

import org.tufuteca.model.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoleRepository {

    private List<Role> roleList = new ArrayList<>(Arrays.asList(new Role("USER"), new Role("ADMIN")));

    public List<Role> getRoleList(){
        return roleList;
    }

}
