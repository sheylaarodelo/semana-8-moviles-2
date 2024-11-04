package com.mascotas.gestion;

public class Pajaro extends Mascota {
    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro " + getNombre() + " canta: ¡Pío!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + getNombre() + " con semillas y frutas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + getNombre() + " dándole espacio para volar y limpiando su jaula.");
    }
}
