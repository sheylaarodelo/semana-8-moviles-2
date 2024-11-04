package com.mascotas.gestion;

public class Tortuga extends Mascota {
    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La tortuga " + getNombre() + " no hace mucho ruido.");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + getNombre() + " con vegetales y pellets.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + getNombre() + " asegurando un ambiente cálido y limpio.");
    }
}
