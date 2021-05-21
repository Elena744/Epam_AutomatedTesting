package com.company;

public class Product {
    private String nameProduct;
    private double costProduct;

    public Product(String nameProduct, double costProduct) {
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getCostProduct() {
        return costProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setCostProduct(double costProduct) {
        this.costProduct = costProduct;
    }

    public void print(){
        System.out.println(getNameProduct() + " " + getCostProduct());
    }
}
