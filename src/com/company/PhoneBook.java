package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook { // Сам телефонный справочник (в нем добавляем, удаляем, получаем)
    private Map<String, Person> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addPerson(String name) {
        contacts.put(name.toLowerCase(), new Person(name));
    }

    public void removePerson(String name) {
        contacts.remove(name.toLowerCase());
    }

    public Person getPerson(String name) {
        return contacts.get(name.toLowerCase());
    }

    public void getAllPersons() {
        Set<String> allPersons = contacts.keySet();
        System.out.println("Contacts :" + allPersons);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts;
    }
}
