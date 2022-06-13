package ru.netology.domain;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String query) {
    return name.contains(query);
    }

    public int getId() {
        return id;
    }
}

