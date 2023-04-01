package nl.ilovecoding.karate.controller;

import lombok.RequiredArgsConstructor;
import nl.ilovecoding.karate.UserRepository;
import nl.ilovecoding.karate.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class KarateController {

    private final  UserRepository userRepository;



    @GetMapping("/rest/api/users")
    public List<User> home (){

        return userRepository.getUsers();
    }
}
