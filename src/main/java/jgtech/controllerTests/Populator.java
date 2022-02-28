package jgtech.controllerTests;

import jgtech.controllerTests.models.User;
import jgtech.controllerTests.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private UserRepository userRepo;

    public Populator(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        User sample1 = new User("UserOne");
        User sample2 = new User("UserTwo");

        userRepo.save(sample1);
        userRepo.save(sample2);
    }
}
