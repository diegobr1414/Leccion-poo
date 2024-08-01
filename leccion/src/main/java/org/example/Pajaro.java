package org.example;

public class Pajaro extends Animal implements Volador {
    private String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println("El pájaro está comiendo.");
    }

    public void volar() {
        System.out.println("El pájaro está volando.");
    }

    public String getNombre() {
        return nombre;
    }
}
