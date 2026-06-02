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

    // Observer
    public void suscribir(ObservadorPersonaje o) { observadores.add(o); }
    public void desuscribir(ObservadorPersonaje o) { observadores.remove(o); }
    private void notificar(String evento) { observadores.forEach(o -> o.actualizar(this, evento)); }

    // Strategy dinámico de ataque
    public void setEstrategiaAtaque(EstrategiaAtaque e) {
        this.estrategiaAtaque = e;
        System.out.println("[Strategy] " + nombre + " cambia estrategia de ataque");
        notificar("cambia estrategia de ataque");
    }

    public void atacarConEstrategia(String objetivo) {
        if (estrategiaAtaque != null) {
            String resultado = estrategiaAtaque.ejecutar(nombre, objetivo);
            System.out.println(resultado);
            notificar("ataca a " + objetivo);
        } else {
            System.out.println(nombre + " no tiene estrategia de ataque definida.");
        }
    }

    // Strategy dinámico de defensa
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

    // Eventos
    public void recibirDanio(int d) {
        hp -= d;
        System.out.println(nombre + " recibe " + d + " de daño (HP=" + hp + ")");
        notificar("recibe " + d + " de daño");
    }

    public void subirNivel() {
        System.out.println(nombre + " sube de nivel!");
        notificar("nivel");
    }

    // Template Method
    public final void ejecutarTurno(String objetivo) {
        preparar();
        atacar(objetivo);              // paso variante
        aplicarEfectoEspecial();       // hook opcional
        cerrarTurno();
    }

    private void preparar() {
        System.out.println("  [" + getClass().getSimpleName() + "] Preparando...");
    }

    private void cerrarTurno() {
        System.out.println("  [" + getClass().getSimpleName() + "] Finalizado.\n");
    }

    // Paso variante: cada subclase define su ataque
    protected abstract void atacar(String objetivo);

    // Hook opcional: por defecto vacío
    protected void aplicarEfectoEspecial() { }
}
