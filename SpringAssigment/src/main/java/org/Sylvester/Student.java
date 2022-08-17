package org.Sylvester;

public class Student implements Person{
    public Phone phone;
    public Address address;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String Name;
    public int ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void Info() {
        System.out.println(ID);
        System.out.println(Name);
        System.out.println(phone);
        System.out.println(address);

    }
}
