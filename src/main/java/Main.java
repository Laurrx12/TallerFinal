/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("EQUIPO");

        Personaje p1 =
                FabricaPersonajes.crear("guerrero", "Thorin");

        Personaje p2 =
                FabricaPersonajes.crear("mago", "Gandalf");

        Personaje p3 =
                FabricaPersonajes.crear("arquero", "Legolas");

        Personaje p4 =
                FabricaPersonajes.crear("paladin", "Uther");

        System.out.println(p1.atacar());
        System.out.println(p2.atacar());
        System.out.println(p3.atacar());
        System.out.println(p4.atacar());

        System.out.println("\nMISIONES");

        GestorMisiones gm =
                GestorMisiones.getInstance();

        gm.agregarMision("Derrotar dragon");
        gm.agregarMision("Rescatar aldeano");

        gm.listar();

        System.out.println("\nPRUEBA SINGLETON");

        RegistroPartida r1 =
                RegistroPartida.getInstancia();

        RegistroPartida r2 =
                RegistroPartida.getInstancia();

        System.out.println(r1 == r2);
    }
}
