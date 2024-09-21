package com.study.entities;

public class Address {

    private String zipCode;

    private State state;

    private String city;

    private String district;

    private String street;

    private int houseNumber;

    private String complement;


    public Address(String zipCode, State state, String city, String district, String street, int houseNumber, String complement) {
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.complement = complement;
    }

    public Address(String zipCode, State state, String city, String district, String street, int houseNumber) {
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(State state, String city, String district, String street, int houseNumber) {
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
