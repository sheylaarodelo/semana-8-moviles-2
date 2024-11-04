package com.mascotas.gestion;

public class Gato extends Mascota {
    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + getNombre() + " maulla: ¡Miau!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + getNombre() + " con alimento balanceado.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + getNombre() + " cepillándolo y jugando.");
    }
}

