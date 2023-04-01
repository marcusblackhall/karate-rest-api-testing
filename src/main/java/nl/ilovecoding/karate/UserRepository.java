package nl.ilovecoding.karate;

import nl.ilovecoding.karate.model.Address;
import nl.ilovecoding.karate.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public List<User> getUsers(){

        Address address = Address.builder()
                .city("Amsterdam")
                .postcode("3333 JH")
                .street("Prinsengraccht 456")
                .build();

        User user = User.builder()
                .name("Jan Smit")
                .address(address)
                .build();

        return List.of(user);

    }
}
