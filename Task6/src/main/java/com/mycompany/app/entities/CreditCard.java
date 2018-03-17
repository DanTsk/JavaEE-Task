package com.mycompany.app.entities;

import com.mycompany.app.enums.CreditCardType;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    private String number;
    private String expiryDate;
    private Integer controlNumber;

    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    public CreditCard(String number, String expiryDate, Integer controlNumber, CreditCardType cct) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.controlNumber = controlNumber;
        this.creditCardType = cct;
    }

    public CreditCard() {
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public Integer getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
// Constructors, getters, setters
}
