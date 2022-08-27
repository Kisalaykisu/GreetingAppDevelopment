package com.example.greetingappdevelopment.repository;

import model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting,Integer> {
}
