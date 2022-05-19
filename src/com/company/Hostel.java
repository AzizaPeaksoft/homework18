package com.company;

import java.util.Arrays;

public class Hostel implements Liveable {
    private Person[] hostel;
    private String address;

    public Hostel(Person[] hostel, String address) {
        this.hostel = hostel;
        this.address = address;
    }
    public Hostel () {

    }

    public Person[] getHostel() {
        return hostel;
    }

    public void setHostel(Person[] hostel) {
        this.hostel = hostel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void payMethod() {
        System.out.println("оплата за аренду общежитии");

    }

    @Override
    public String toString() {
        return "Hostel " +
                "hostel = " + Arrays.toString(hostel) +
                ", address = " + address + '\'' +
                ' ';
    }
}
