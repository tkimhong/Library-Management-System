package models;


public class User {
    private String name;
    private String studentID;
    private String email;
    private boolean isActive;


    public User (String name, String studentID, String email){
        this.name = name;
        this.studentID = studentID;
        this.email = email;
        this.isActive = true;
    }
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

    public void setID(String ID) {
        this.studentID = ID;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }
    public String toString() {
        return "Name: " + name +
                "\nStudent ID: " + studentID +
                "\nEmail: " + email +
                "\nActive: " + (isActive ? "Yes" : "No");
    }
}


