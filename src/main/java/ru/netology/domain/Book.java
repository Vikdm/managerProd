package ru.netology.domain;

public class Book extends Product {
    private String creator;

    public Book(int id, String name, int price, String creator) {
        super(id, name, price);
        this.creator = creator;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (creator.contains(query)) {
            return true;
        }
        return false;
    }
}