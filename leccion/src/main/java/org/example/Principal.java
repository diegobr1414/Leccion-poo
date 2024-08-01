package org.example;

public class Principal {
    public static void main(String[] args) {
        Pajaro miPajaro = new Pajaro("Diego");
        miPajaro.comer();
        miPajaro.volar();
        System.out.println("El nombre del pájaro es: " + miPajaro.getNombre());
    }
}