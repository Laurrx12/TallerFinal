package com.mycompany.proyectfinal;

import interfaces.EstrategiaAtaque;
import interfaces.EstrategiaDefensa;
import java.util.*;
import observadores.ObservadorPersonaje;

public abstract class Personaje {
    protected String nombre;
    protected int hp;
    private EstrategiaAtaque estrategiaAtaque;
    private EstrategiaDefensa estrategiaDefensa;
    private List<ObservadorPersonaje> observadores = new ArrayList<>();

    public Personaje(String nombre, int hp) {
        this.nombre = nombre;
        this.hp = hp;
    }

    public String getNombre() { return nombre; }
    public int getHp() { return hp; }

    public void suscribir(ObservadorPersonaje o) { observadores.add(o); }
    public void desuscribir(ObservadorPersonaje o) { observadores.remove(o); }
    private void notificar(String evento) { observadores.forEach(o -> o.actualizar(this, evento)); }

    public abstract String atacar();

    public void setEstrategiaAtaque(EstrategiaAtaque e) {
        this.estrategiaAtaque = e;
        System.out.println("[Strategy] " + nombre + " cambia estrategia de ataque");
        notificar("cambia estrategia de ataque");
    }

    public void atacar(String objetivo) {
        if (estrategiaAtaque != null) {
            String resultado = estrategiaAtaque.ejecutar(nombre, objetivo);
            System.out.println(resultado);
            notificar("ataca a " + objetivo);
        } else {
            System.out.println(nombre + " no tiene estrategia de ataque definida.");
        }
    }

    public void setEstrategiaDefensa(EstrategiaDefensa d) {
        this.estrategiaDefensa = d;
        System.out.println("[Strategy] " + nombre + " cambia estrategia de defensa");
        notificar("cambia estrategia de defensa");
    }

    public void defender() {
        if (estrategiaDefensa != null) {
            String resultado = estrategiaDefensa.defender(nombre);
            System.out.println(resultado);
            notificar("se defiende");
        } else {
            System.out.println(nombre + " no tiene estrategia de defensa definida.");
        }
    }

    public void recibirDanio(int d) {
        hp -= d;
        System.out.println(nombre + " recibe " + d + " de daño (HP=" + hp + ")");
        notificar("recibe " + d + " de daño");
    }

    public void subirNivel() {
        System.out.println(nombre + " sube de nivel!");
        notificar("nivel");
    }
}
