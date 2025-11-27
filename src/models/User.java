package models;

public class User {
    // TODO (Mengkheang): Add these fields
    // - String name
    // - String studentID
    // - String email
    // - boolean isActive
    private String name;
    private String studentID;
    private String email;
    private boolean isActive;


    // TODO: Add constructor
    public User (String name, String studentID, String email){
        this.name = name;
        this.studentID = studentID;
        this.email = email;
        this.isActive = true;
    }
    // TODO: Add getters and setters
    public String getName() {
        return name;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getEmail(){
        return email;
    }

    public boolean isActive(){
        return isActive;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }
    // TODO: Add toString() method for displaying user info
    public String toString() {
        return "Name: " + name +
                "\nStudent ID: " + studentID +
                "\nEmail: " + email +
                "\nActive: " + (isActive ? "Yes" : "No");
    }
}
