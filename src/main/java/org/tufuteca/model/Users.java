package org.tufuteca.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {

    private String username;
    private String password;
    private String surname;
    private String name;
    private String patronymic;
    private Role role;

}
