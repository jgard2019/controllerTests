package jgtech.controllerTests.repositories;

import jgtech.controllerTests.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
