package com.matiasglaure;

public class EjerciciosJava2 {

    public static void main(String[] args) {
        double precio = 15.60d;

        System.out.println("El precio es de $" + precio);

        double precioConIVA = precio * 0.21d;

        System.out.println("El IVA es de $" + precioConIVA);


        double suma = precio + precioConIVA;
        System.out.println("El precio mas el IVA es de $" + suma);
    }

    double precio;
}