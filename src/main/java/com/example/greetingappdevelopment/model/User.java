package com.example.greetingappdevelopment.model;


<<<<<<< HEAD
public class User {
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
>>>>>>> UC4_GreetingController_App
    private String fName;
    private String lName;

    public User() {

    }
<<<<<<< HEAD
    public User(User user) {
        this.fName=user.fName;
        this.lName=user.lName;
    }
=======

    public User(String fName,String lName) {
        super();
        this.fName=fName;
        this.lName=lName;

    }
    public User(User user) {
        this.id= user.id;
        this.fName=user.fName;
        this.lName=user.lName;
    }



>>>>>>> UC4_GreetingController_App
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
}
