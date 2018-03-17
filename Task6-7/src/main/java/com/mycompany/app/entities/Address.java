package com.mycompany.app.entities;

import javax.persistence.*;

@Entity
@SecondaryTables({
        @SecondaryTable(name = "city"),
        @SecondaryTable(name = "country")
})
public class Address {
    @Id
    private Long id;
    private String street1;
    private String street2;

    @Column(table = "city")
    private String city;

    @Column(table = "city")
    private String state;

    @Column(table = "city")
    private String zipcode;

    @Column(table = "country")
    private String country;

    @OneToOne(mappedBy = "address")
    private Customer customer;


    public Address(String street1, String street2, String city, String state, String zipcode, String country) {
        this.state = state;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Address() {
    }


    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
