package com.company;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    //Bu değişkenlere dışarıdan erişebilmek için 2 yol vardır:
    //1-Constructor, 2-getter setter

    public Customer(){

    }
    public Customer(int id, String firstName, String lastName) {

        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
