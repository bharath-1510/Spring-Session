package org.accolite.model;

public class Address {
    public String getCity() {
        return city;
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "city : " + city+
                ", state : " + state ;
    }

    private String city,state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
