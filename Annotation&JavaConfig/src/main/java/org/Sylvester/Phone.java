package org.Sylvester;

import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class Phone {
    public List<String> p;

    @Override
    public String toString() {
        return "Phone{" +
                "Numbers=" + p +
                '}';
    }
}
