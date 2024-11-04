package com.mascotas.gestion;

public class Perro extends Mascota {
    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + getNombre() + " ladra: ¡Guau!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + getNombre() + " con croquetas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + getNombre() + " con paseos diarios y baño.");
    }
}

