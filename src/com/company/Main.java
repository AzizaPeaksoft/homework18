package com.company;

public class Main {

    public static void main(String[] args) {

//            Person[] family= {new Person("Maksat", 30),
//                    new Person("Abai", 25),
//                    new Person("Azat", 25),
//                    new Person("Ulan", 27),
//                    new Person("Altynabek", 24),
//                    new Person("Nurgazy", 20),
//                    new Person("Nursultan", 32),
//                    new Person("Aigul", 22),
//                    new Person("Jazgul", 19),
//                    new Person("Aichurok", 15)};
//
//        for (Person a : family) {
//            System.out.println(a);
//
//
//            Person[] flat = {new Person("Maksat", 30), new Person("Nursultan", 25)};
//            for (Person b : flat) {
//                System.out.println(b);
//
//            }
//
//            Person[] hostel = {new Person("Abai", 25),
//                    new Person("Azat", 25),
//                    new Person("Ulan", 27),
//                    new Person("Altynbek", 24),
//                    new Person("Nurgazy", 20),
//                    new Person("Aigul", 22)};
//            for (Person c: hostel) {
//                System.out.println(c);
//            }
//            Person[] hotel = {new Person("Jazgul", 19), new Person("Aichurok", 15)};
//            for (Person d: hotel) {
//                System.out.println(d);
//            }
//        }

        Person person1 = new Person("Maksat", 30);
        Person person2 = new Person("Nursultan", 25);
        Person person3 = new Person("Bekjan", 20);

        Person person4 = new Person("Klara", 30);
        Person person5 = new Person("Aichurok", 29);
        Person person6 = new Person("Kunzaada", 25);
        Person person7 = new Person("Aziza", 30);

        Person person8 = new Person("Nazgul", 22);
        Person person9 = new Person("Jazgul", 20);

        Person[] flats = {person1,person2,person3};
        Person[] hostels = {person4, person5, person6, person7};
        Person[] hotels = {person8, person9};



        int count1 = 0;
        for (Person flat : flats) {
            count1++;
        }

        int count2 = 0;
        for (Person hostel : hostels ) {
            count2++;

        }
        int count3 = 0;
        for (Person hotel : hotels) {
            count3++;

        }

        Flat flat = new Flat(flats, "street Grajdanskaya");
        System.out.println(flat);
        System.out.println("количесвто " + count1);
        flat.payMethod();


        Hostel hostel = new Hostel(hostels, "street. Akhunbaeva 91");
        System.out.println(hostel);
        System.out.println("количесвто " + count2);
        hostel.payMethod();

        Hotel hotel = new Hotel(hotels, "street. Vostok 5");
        System.out.println(hotel);
        System.out.println("количесвто " + count3);
        hotel.payMethod();
    }
}


