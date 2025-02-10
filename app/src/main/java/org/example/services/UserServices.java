package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserServices {
    ObjectMapper objectMapper = new ObjectMapper();
    private final String USERS_PATH = "app/src/main/java/org/example/db/users.json";
    List<User> listOfUsers;
    User user;
    public UserServices() throws IOException {
        loadUsers();
    }

    public UserServices(User user) throws IOException {
        this.user=user;
        loadUsers();
    }

    private void loadUsers() throws IOException {
        listOfUsers = objectMapper.readValue(new File(USERS_PATH), new TypeReference<List<User>>() {});
//        System.out.println(listOfUsers);
    }

    public boolean loginUser() {
        Optional<User> ifUser = listOfUsers.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user.getHashedPassword());
        }).findFirst();
        return ifUser.isPresent();
    }

    public boolean signupUser(User user) {
        try {
            listOfUsers.add(user);
            saveUsers();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void saveUsers() throws IOException {
        File usersFile = new File(USERS_PATH);
        objectMapper.writeValue(usersFile,listOfUsers);
    }
}
