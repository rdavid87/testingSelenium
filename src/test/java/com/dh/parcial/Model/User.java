package com.dh.parcial.Model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private int subscribe;

    public User(String firstName, String lastName, String email, String telephone, String password, int subscribe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.subscribe = subscribe;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    public int getSubscribe() {
        return subscribe;
    }
}
