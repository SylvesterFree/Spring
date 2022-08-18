package org.Sylvester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component
public class Student implements Person{
    //@Autowired
    Phone phone;
    //@Autowired
    Address address;



    public String Name;
    public int ID;



    @Override
    public void Info() {
        System.out.println(ID);
        System.out.println(Name);
        System.out.println(phone);
        System.out.println(address);

    }
}
