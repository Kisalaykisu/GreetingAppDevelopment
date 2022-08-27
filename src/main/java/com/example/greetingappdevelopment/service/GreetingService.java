package com.example.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getMessage(){
        return "Hello World";
    }
<<<<<<< HEAD
=======

    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }

    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }
>>>>>>> UC3_GreetingController_App
}
