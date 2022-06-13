package ru.netology.domain;

public class ProdManager {

    private Product[] prod = new Product[0];
    private ProdRepo repo;


    public ProdManager(ProdRepo repo) {
        this.repo = repo;
    }

    public void add(Product prod) {
        repo.save(prod);
    }

    public Product[] searchBy(String query) {
        Product[] result = new Product[0];
        for (Product prod : repo.findAll()) {
            if (prod.matches(query)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = prod;
                result = tmp;
            }
        }
        return result;
    }

}
