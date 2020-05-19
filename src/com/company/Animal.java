package com.company;

import java.io.Serializable;

public class Animal implements Serializable {
public String Name;

    public Animal(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
