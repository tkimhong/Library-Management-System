package services;

import models.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    // TODO (Mengkheang): Implement these methods

    public void addUser(String name, String studentID, String email) {
        // TODO: Create new user and add to list
    }

    public User viewUser(String studentID) {
        // TODO: Search and return user by studentID
        return null;
    }

    public void editUser(String studentID, String newName, String newEmail) {
        // TODO: Find user and update their information
    }

    public void deactivateUser(String studentID) {
        // TODO: Find user and set isActive to false
    }

    public ArrayList<User> getAllUsers() {
        return users;
    }
}
