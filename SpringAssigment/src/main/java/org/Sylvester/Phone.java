package org.Sylvester;

import java.util.List;

public class Phone {
    public List<String> p;

    public List<String> getP() {
        return p;
    }

    public void setP(List<String> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Numbers=" + p +
                '}';
    }
}
