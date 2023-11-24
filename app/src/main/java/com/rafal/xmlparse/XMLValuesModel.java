package com.rafal.xmlparse;

public class XMLValuesModel {
    private int id;
    private int id_company;
    private String company;
    private String date;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    private String telephons;
    private String forms;

    public int getId() {
        return id;
    }

    public int getId_company() {
        return id_company;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

    public String getTelephons() {
        return telephons;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTelephons(String telephons) {
        this.telephons = telephons;
    }

}
