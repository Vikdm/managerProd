package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProdManagerTest {

    ProdRepo repo = new ProdRepo();
    ProdManager manager = new ProdManager(repo);

    Product book1 = new Book(11, "The Witcher", 200, "A. Sapkowski");
    Product smartphone1 = new Smartphone(22, "13 Pko", 100_000, "Apple");
    Product book2 = new Book(33, "The Zirael", 200, "A. Sapkowski");
    Product smartphone2 = new Smartphone(44, "12", 70_000, "Apple");

    @Test
    public void searchTest1() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

       Product[] actual = manager.searchBy("pp");
       Product[] expected = { smartphone1, smartphone2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchTest2() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("ko");
        Product[] expected = { book1, book2, smartphone1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeTest1 (){
        repo.save(book1);
        repo.save(smartphone1);
        repo.save(book2);
        repo.removeById(22);
        repo.findAll();

        Product[] actual = repo.findAll();
        Product[] expected = { book1, book2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void searchTest3() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("it");
        Product[] expected = { book1 };

        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeTest2 (){
        repo.save(book1);
        repo.save(smartphone1);
        repo.save(book2);
        repo.removeById(33);
        repo.findAll();

        Product[] actual = repo.findAll();
        Product[] expected = { book1, smartphone1};

        assertArrayEquals(actual, expected);
    }

}
