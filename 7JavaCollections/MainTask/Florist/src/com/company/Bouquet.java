package com.company;

import java.util.*;

public class Bouquet {
    private double price;
    private List<Product> bouquet = new ArrayList<Product>();

    public void getPrice() {
        printBouquet(bouquet);
        System.out.println(price);
    }

    public Bouquet addProduct_test(Product product) {
        bouquet.add(product);
        price += product.getCostProduct();
        return this;
    }
    public void addProductBouquet(Product product) {
        bouquet.add(product);
        price += product.getCostProduct();
    }

    public void printBouquet(List<Product> bouquet){
        Iterator<Product> iterator = bouquet.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            product.print();
        }
    }

    public void sortFreshnessFlowerBouquet(){
        List<Product> temporaryBouquet = bouquet;
        temporaryBouquet.removeIf(p -> p.getClass() == Accessory.class);
        Collections.sort(temporaryBouquet, new Comparator<Product>() {
            @Override
            public int compare(Product flower1, Product flower2) {
                return ((Flower)flower2).getFreshnessFlower() - ((Flower)flower1).getFreshnessFlower();
            }
        });
        printBouquet(temporaryBouquet);
    }

    public void selectionFlowerBouquet(int minLengthStemFlower, int maxLengthStemFlower){
        List<Product> temporaryBouquet = bouquet;
        temporaryBouquet.removeIf(p -> p.getClass() == Accessory.class);
        temporaryBouquet.removeIf(p -> ((Flower)p).getLengthStemFlower() > maxLengthStemFlower || ((Flower)p).getLengthStemFlower() < minLengthStemFlower);
        printBouquet(temporaryBouquet);
    }
}
