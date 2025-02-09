package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserServices {
    ObjectMapper objectMapper = new ObjectMapper();
    private final String USERS_PATH = "app/src/main/java/org/example/db/users.json";
    List<User> listOfUsers;
    public UserServices() throws IOException {
        loadUsers();
    }

    private void loadUsers() throws IOException {
        listOfUsers = objectMapper.readValue(new File(USERS_PATH), new TypeReference<List<User>>() {});
//        System.out.println(listOfUsers);
    }
}
