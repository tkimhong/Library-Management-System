package models;

import java.util.ArrayList;

public class UserService
{

    private ArrayList<User> users = new ArrayList<>();

    public void addUser(String name, String studentID, String email) {
        for (User u : users)

        {
            if (u.getStudentID().equals(studentID)) {
                System.out.println("User already exists.");
                return;

            }
        }

        User newUser = new User(name, studentID, email);

        users.add(newUser);
        System.out.println("User added!");
    }

    public void viewUser(String studentID) {
        boolean found = false;

        for (User u : users) {
            if (u.getStudentID().equals(studentID)) {
                System.out.println("==== User Details ====");
                System.out.println(u);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    public void editUser (String studentID, String newName, String newEmail){
        boolean found = false;
        for (User u : users){
            if (u.getStudentID().equals(studentID)){
                if (newName != null && !newName.isEmpty()){
                    u.setName(newName);
                }
                if (newEmail != null && !newEmail.isEmpty()){
                    u.setEmail(newEmail);
                }
                System.out.println("User updated successfully!");
                found = true;
                break;
            }

        }
        if (!found){
            System.out.println("User is not found.");
        }
    }

    public void deactivateUser(String studentID){
        boolean found = false;
        for (User u : users){
            if (u.getStudentID().equals(studentID)){
                u.setActive(false);
                System.out.println("User has been deactivated.");
                found = true;
                break;
            }

        }
        if (!found){
            System.out.println("User not found.");
        }
    }
}