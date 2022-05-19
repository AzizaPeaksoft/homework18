package com.company;

import java.util.Arrays;

public class Hotel implements Liveable {
    private Person[] hotel;
    private String address;

    public Hotel(Person[] hotel, String address) {
        this.hotel = hotel;
        this.address = address;
    }
    public Hotel () {

    }

    public Person[] getHotel() {
        return hotel;
    }

    public void setHotel(Person[] hotel) {
        this.hotel = hotel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void payMethod() {
        System.out.println("оплата за аренду отель");

    }

    @Override
    public String toString() {
        return "Hotel " +
                "hotel = " + Arrays.toString(hotel) +
                ", address =  " + address + '\'' +
                ' ';
    }
}
