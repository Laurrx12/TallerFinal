/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectfinal;

/**
 *
 * @author Admin
 */
public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    protected void atacar(String objetivo) {
        System.out.println("  Mago lanza hechizo a " + objetivo + " — daño: 70");
    }

    @Override
    protected void aplicarEfectoEspecial() {
        System.out.println("  El Mago regenera 10 de mana.");
    }
}

