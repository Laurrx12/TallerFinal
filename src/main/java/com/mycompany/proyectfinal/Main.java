package com.mycompany.proyectfinal;

import interfaces.Ataque;

import Estrategias.AtaqueBasico;
import Estrategias.EfectoFuego;
import Estrategias.EfectoHielo;
import Estrategias.EfectoVeneno;
import Estrategias.EfectoRayo;
import Estrategias.AtaqueEspada;
import Estrategias.AtaqueFurtivo;
import Estrategias.EvasionRapida;
import Estrategias.BarreraArcana;

// Importar observadores
import observadores.LogCombate;
import observadores.GestorLogros;
import observadores.SistemaSonido;

public class Main {
    public static void main(String[] args) {
        Personaje thorin = new Guerrero("Thorin", 120);

        // Suscribir observadores
        thorin.suscribir(new LogCombate());
        thorin.suscribir(new GestorLogros());
        thorin.suscribir(new SistemaSonido());

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

        // Probar eventos adicionales
        thorin.recibirDanio(30);
        thorin.subirNivel();
        
        Ataque base       = new AtaqueBasico();
        Ataque conFuego   = new EfectoFuego(base);
        Ataque combo      = new EfectoHielo(new EfectoVeneno(new EfectoFuego(base)));
        Ataque conRayo    = new EfectoRayo(base);
        Ataque comboFull  = new EfectoRayo(new EfectoHielo(new EfectoVeneno(new EfectoFuego(base))));

        System.out.println(base.ejecutar()     + " → " + base.danio());
        System.out.println(conFuego.ejecutar() + " → " + conFuego.danio());
        System.out.println(combo.ejecutar()    + " → " + combo.danio());
        System.out.println(conRayo.ejecutar()  + " → " + conRayo.danio());
        System.out.println(comboFull.ejecutar()+ " → " + comboFull.danio());
        
        Personaje[] equipo = { 
            new Guerrero("Thorin"), 
            new Mago("Gandalf"), 
            new Arquero("Legolas"), 
            new Paladin("Uther") 
        };
        
        for (Personaje p : equipo) {
            p.ejecutarTurno("Dragón");
        }
    }
}