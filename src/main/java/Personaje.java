/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import interfaces.EstrategiaAtaque;
import interfaces.EstrategiaDefensa;

public abstract class Personaje {
    protected String nombre;
    protected int hp;
    private EstrategiaAtaque estrategiaAtaque;
    private EstrategiaDefensa estrategiaDefensa;

    public Personaje(String nombre, int hp) {
        this.nombre = nombre;
        this.hp = hp;
    }

    public abstract String atacar(); // ataque fijo

    // Strategy dinámico de ataque
    public void setEstrategiaAtaque(EstrategiaAtaque e) {
        this.estrategiaAtaque = e;
        System.out.println("[Strategy] " + nombre + " cambia estrategia de ataque");
    }

    public void atacar(String objetivo) {
        if (estrategiaAtaque != null) {
            System.out.println(estrategiaAtaque.ejecutar(nombre, objetivo));
        } else {
            System.out.println(nombre + " no tiene estrategia de ataque definida.");
        }
    }

    // Strategy dinámico de defensa
    public void setEstrategiaDefensa(EstrategiaDefensa d) {
        this.estrategiaDefensa = d;
        System.out.println("[Strategy] " + nombre + " cambia estrategia de defensa");
    }

    public void defender() {
        if (estrategiaDefensa != null) {
            System.out.println(estrategiaDefensa.defender(nombre));
        } else {
            System.out.println(nombre + " no tiene estrategia de defensa definida.");
        }
    }
}
