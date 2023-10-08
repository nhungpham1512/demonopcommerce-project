package com.nhungtester.entity;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class User {
    private String firstName;
    private String lastName;
    private String birthday;
    private int birthMonth;
    private String birthYear;
    private String email;
    private String company;
    private String password;

    Random random = new Random();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

     public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String lastName, String birthday, int birthMonth, String birthYear, String email, String company, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.company = company;
        this.password = password;
    }

    public User(String firstName, String password) {
        this.firstName = firstName;
        this.lastName = "Pham";
        this.birthday = "16";
        this.birthMonth = 2;
        this.birthYear = "1993";
        this.email = firstName + random.nextInt()+"@gmail.com";
        this.company = "ABC company";
        this.password = password;

    }

}
