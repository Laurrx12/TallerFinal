/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import Estrategias.AtaqueEspada;
import Estrategias.AtaqueFurtivo;
import Estrategias.EvasionRapida;
import Estrategias.BarreraArcana;

public class Main {
    public static void main(String[] args) {
        Personaje thorin = new Guerrero("Thorin");

        // Ataques dinámicos
        thorin.setEstrategiaAtaque(new AtaqueEspada());
        thorin.atacar("Dragón");

        thorin.setEstrategiaAtaque(new AtaqueFurtivo());
        thorin.atacar("Dragón");

        // Defensas dinámicas
        thorin.setEstrategiaDefensa(new EvasionRapida());
        thorin.defender();

        thorin.setEstrategiaDefensa(new BarreraArcana());
        thorin.defender();
    }
}
