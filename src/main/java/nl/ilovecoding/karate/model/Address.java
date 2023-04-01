package nl.ilovecoding.karate.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private String city;
    private String postcode;
    private String street;
}
