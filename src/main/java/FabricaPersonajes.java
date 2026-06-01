/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
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
