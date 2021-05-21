package com.company;

import java.util.Comparator;

public class Flower extends Product implements Comparator<Flower> {
    private int freshnessFlower;
    private int lengthStemFlower;

    public Flower(String nameFlower, double costFlower) {
        super(nameFlower, costFlower);
        this.freshnessFlower = 0;
        this.lengthStemFlower = 0;
    }

    public Flower(String nameFlower, double costFlower, int freshnessFlower, int lengthStemFlower) {
        super(nameFlower, costFlower);
        this.freshnessFlower = freshnessFlower;
        this.lengthStemFlower = lengthStemFlower;
    }

    public String getNameFlower() {
        return getNameProduct();
    }

    public double getCostFlower() {
        return getCostProduct();
    }

    public int getFreshnessFlower() {
        return freshnessFlower;
    }

    public int getLengthStemFlower() {
        return lengthStemFlower;
    }

    public void setNameFlower(String nameFlower) {
        setNameProduct(nameFlower);
    }

    public void setCostFlower(double costFlower) {
        setCostProduct(costFlower);
    }

    public void setFreshnessFlower(int freshnessFlower) {
        this.freshnessFlower = freshnessFlower;
    }

    public void setLengthStemFlower(int lengthStemFlower) {
        this.lengthStemFlower = lengthStemFlower;
    }

    @Override
    public int compare(Flower flower1, Flower flower2) {
        int result = 0;
        if (flower2.getFreshnessFlower() - flower1.getFreshnessFlower() > 0){
            result = 1;
        }
        if (flower2.getFreshnessFlower() - flower1.getFreshnessFlower() < 0){
            result = -1;
        }
        return result;
    }

    @Override
    public void print() {
        System.out.println(getNameProduct() + " " + getCostProduct() + " " +getFreshnessFlower() + " " + getLengthStemFlower());
    }
}
