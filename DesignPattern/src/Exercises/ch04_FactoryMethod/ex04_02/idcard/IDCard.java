package Exercises.ch04_FactoryMethod.ex04_02.idcard;

import Exercises.ch04_FactoryMethod.ex04_02.framework.Product;


public class IDCard extends Product {
    static private int total_id = 0;
    private int id;
    private String owner;
    IDCard(String owner) {
        this.id = total_id;
        this.owner = owner;
        total_id++;
        System.out.println("ID:" + id + "\t" + owner + "のカードを作ります。");
    }
    public void use() {
        System.out.println("ID:" + id + "\t" + owner + "のカードを使います。");
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }
}

