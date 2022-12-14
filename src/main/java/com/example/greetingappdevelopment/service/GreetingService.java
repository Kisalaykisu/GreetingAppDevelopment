package com.example.greetingappdevelopment.service;

import com.example.greetingappdevelopment.model.Greeting;
import com.example.greetingappdevelopment.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private static String template="Hello %s";
    @Autowired
    GreetingAppRepository repo;
    public String getMessage(){
        return "Hello World";
    }

    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }

    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }

    public Greeting saveMessage(Greeting greeting) {
        Greeting newGreeting=new Greeting(String.format(template,greeting.getContent()));
        repo.save(newGreeting);
        return newGreeting;

    }

    public String getDataById(Integer id) {
        Greeting newGreeting=repo.getById(id);
        return newGreeting.getContent();
    }

    public List<Greeting> getAllData() {
        List<Greeting>list=repo.findAll();
        return list;
    }

    public Greeting editDataById(Integer id, String content) {
        Greeting newGreeting=new Greeting(id,String.format(template,content));
        repo.save(newGreeting);
        return newGreeting;
    }

    public String deleteDataById(Integer id) {
        repo.deleteById(id);
        return "Greeting message having id "+id+", got deleted";
    }
}