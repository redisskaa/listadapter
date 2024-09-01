package com.app.listadapter;

public class UserModel {
    private int image;
    private String name;
    private String lastName;
    private String country;
    private String city;
    private String age;

    public UserModel(int image, String name, String lastName, String country, String city, String age) {
        this.image = image;
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAge() {
        return age;
    }
}