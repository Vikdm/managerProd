package ru.netology.domain;

public class ProdRepo {
    private Product[] prods = new Product[0];

    public void save(Product prod) {
        int len = prods.length + 1;
        Product[] tmp = new Product[len];

        for (int i = 0; i < prods.length; i++) {
            tmp[i] = prods[i];
        }

        int lastProd = tmp.length - 1;
        tmp[lastProd] = prod;
        prods = tmp;
    }

    public Product[] findAll() {
        return prods;
    }

    public void removeById(int id) {
        int len = prods.length - 1;
        Product[] tmp = new Product[len];
        int index = 0;
        for (Product prod : prods) {
            if (prod.getId() != id) {
                tmp [index] = prod;
                index++;
            }
        }
        prods = tmp;
    }
}
