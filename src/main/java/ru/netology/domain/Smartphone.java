package ru.netology.domain;

public class Smartphone extends Product {
    private String maker;

    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

    @Override
    public boolean matches(String query) {
        if (super.matches(query)) {
            return true;
        }
        if (maker.contains(query)) {
            return true;
        }
        return false;
    }
}
