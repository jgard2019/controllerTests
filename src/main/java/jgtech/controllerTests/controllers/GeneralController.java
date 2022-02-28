package jgtech.controllerTests.controllers;


import jgtech.controllerTests.models.User;
import jgtech.controllerTests.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GeneralController {

    private UserRepository userRepo;


    public GeneralController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("")
    public Iterable<User> getUsers(){
        return userRepo.findAll();
    }


    
}
