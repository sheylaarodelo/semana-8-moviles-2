package com.mascotas.gestion;public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Canino", "Labrador", 3, "Mediano", "Dorado", "Saludable");
        Gato gato = new Gato("Luna", "Felino", "Siames", 2, "Pequeño", "Gris", "Saludable");
        Pajaro pajaro = new Pajaro("Piolín", "Ave", "Canario", 1, "Pequeño", "Amarillo", "Saludable");
        Tortuga tortuga = new Tortuga("Torty", "Reptil", "Tortuga de tierra", 5, "Grande", "Verde", "Saludable");

        perro.mostrarInformacion();
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();
        System.out.println();

        gato.mostrarInformacion();
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();
        System.out.println();

        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        System.out.println();

        tortuga.mostrarInformacion();
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
    }
}
