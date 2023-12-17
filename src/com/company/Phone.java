package com.company;

public class Phone { // Класс для создания номера телефона с его типом (домашний, мобильный итд)
    private String type;
    private String number;

    public Phone(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone " +
                "type: " + type +
                ", number: " + number;
    }
}
