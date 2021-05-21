package com.company;

import java.util.List;

public class Main {
    /*
    Определить иерархию цветов. Создать несколько объектов-цветов. Собрать букет (используя аксессуары)
    с определением его стоимости. Провести сортировку
    цветов в букете на основе уровня свежести. Найти цветок в букете, соответствующий
    заданному диапазону длин стеблей.
    * */

    public static void main(String[] args) {

        Product firstProduct = new Mint("Mint_02052012", 5);
        Product secondProduct = new Camomile("Camomile_04052012",3.5,6,8);
        Product thirdProduct = new Camomile("Camomile_03052012",3.5,2,10);
        Product fourthProduct = new Accessory("Ribbon_05", 1);

        Bouquet bouquet = new Bouquet();

        bouquet.addProductBouquet(firstProduct);
        bouquet.addProductBouquet(secondProduct);
        bouquet.addProductBouquet(thirdProduct);
        bouquet.addProductBouquet(fourthProduct);

        System.out.println("Букет и его стоимость:");
        bouquet.getPrice();
        System.out.println("Сортировка цветов в букете на основе уровня свежести:");
        bouquet.sortFreshnessFlowerBouquet();
        System.out.println("Цветы в букете, соответствующие заданному диапазону длин стеблей:");
        bouquet.selectionFlowerBouquet(3,8);
    }
}
