package com.company;

import java.util.Arrays;

public class Flat implements Liveable {
    private Person[] flat;
    private String address;
    public Flat(){

    }
    public Flat(Person[] flat, String address) {
        this.flat = flat;
        this.address = address;
    }

    public Person[] getFlat() {
        return flat;
    }

    public void setFlat(Person[] flat) {
        this.flat = flat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void payMethod() {
        System.out.println("ком.услуги за квартиру");

    }

    @Override
    public String toString() {
        return "Flat " +
                "flat = " + Arrays.toString(flat) +
                ", address = " + address + '\'' +
                ' ';
    }
}
