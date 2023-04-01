package nl.ilovecoding.karate.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    private String name;
    private Address address;
}
