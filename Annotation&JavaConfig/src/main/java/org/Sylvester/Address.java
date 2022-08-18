package org.Sylvester;

import org.springframework.stereotype.Component;

//@Component
public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }


}
