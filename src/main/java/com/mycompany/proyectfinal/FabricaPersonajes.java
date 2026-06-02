package com.mycompany.proyectfinal;

public class FabricaPersonajes {

    public static Personaje crear(String tipo, String nombre) {

        switch(tipo.toLowerCase()) {

            case "guerrero":
                return new Guerrero(nombre);

            case "mago":
                return new Mago(nombre);

            case "arquero":
                return new Arquero(nombre);

            case "paladin":
                return new Paladin(nombre);

            default:
                throw new IllegalArgumentException(
                        "Tipo desconocido");
        }
    }
}
