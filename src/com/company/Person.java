package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person { // Класс для создания человека в телефонном справочнике
    private String name;
    private Map<String, List<Phone>> phones;

    public Person(String name) {
        this.name = name;
        this.phones = new HashMap<>();
    }

    public void addPhone(String type, String number) {
        Phone phone = new Phone(type, number);
        phones.computeIfAbsent(type, k -> new ArrayList<>()).add(phone);
    }

    public void removePhone(String type, String number) {
        if (phones.containsKey(type)) {
            phones.get(type).removeIf(phone -> phone.getNumber().equals(number));
        }
    }

    public List<Phone> findPhoneByType(String type) {
        return phones.getOrDefault(type, new ArrayList<>());
    }

    public List<Phone> findPhoneByName(String name) {
        if(this.name.equalsIgnoreCase(name)) {
            List<Phone> allPhones = new ArrayList<>();
            phones.values().forEach(allPhones::addAll);
            return allPhones;
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Person " +
                "name: " + name +
                ", phones: " + phones;
    }
}
