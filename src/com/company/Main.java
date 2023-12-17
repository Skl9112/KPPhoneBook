package com.company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson("Dmitry");
        phoneBook.addPerson("Kolya");
        phoneBook.addPerson("Petya");
        phoneBook.getAllPersons();

        phoneBook.getPerson("Dmitry").addPhone("Mobile", "123-45-67");
        phoneBook.getPerson("Dmitry").addPhone("HomeNumber", "098-76-54");
        System.out.println(phoneBook.getPerson("Dmitry"));

        List<Phone> homeNumber = phoneBook.getPerson("Dmitry").findPhoneByType("Mobile");
        System.out.println("HomeNumber by Dmitry: " + homeNumber);

        phoneBook.getPerson("Dmitry").removePhone("HomeNumber", "098-76-54");
        homeNumber = phoneBook.getPerson("Dmitry").findPhoneByType("HomeNumber");
        System.out.println("Home numbers by Dmitry after removing: " + homeNumber);

        System.out.println("Dmitry befor removing: " + phoneBook.getPerson("Dmitry"));
        phoneBook.removePerson("Dmitry");
        Person removedPerson = phoneBook.getPerson("Dmitry");
        System.out.println("Dmitry after removing: " + removedPerson);
    }
}
