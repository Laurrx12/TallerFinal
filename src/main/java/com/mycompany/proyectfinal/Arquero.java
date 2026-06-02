/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectfinal;
/**
 *
 * @author Admin
 */
public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    protected void atacar(String objetivo) {
        System.out.println("  Arquero dispara a " + objetivo + " — daño: 55");
    }

    @Override
    protected void aplicarEfectoEspecial() {
        System.out.println("  Arquero gana ventaja crítica.");
    }
}
