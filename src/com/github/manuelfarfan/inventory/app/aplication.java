package com.github.manuelfarfan.inventory.app;
import com.github.manuelfarfan.inventory.models.Inventory;
import com.github.manuelfarfan.inventory.models.Product;

import java.util.Date;
import java.util.Scanner;
public class aplication {
    public static void main(String[] args) {

        Inventory inventory = new Inventory( );
        inventory.setDate(new Date());

        Scanner entry = new Scanner(System.in);
//TODO poner esto en un ciclo, desde aqui, agregar algo que permita cortar el ciclo
        System.out.println("Enter the name of the product");
        String nameProduct=entry.next();
        System.out.println("indicate quantity of product");
        double amount= entry.nextDouble();


        Product newProduct = new Product();
        newProduct.setName(nameProduct);
        inventory.addProduct(newProduct,amount);
//hasta aqui

        //TODO imprimir el hashmap

    }
}
