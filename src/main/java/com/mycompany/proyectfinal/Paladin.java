/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectfinal;
/**
 *
 * @author Admin
 */
public class Paladin extends Personaje {

    public Paladin(String nombre) {
        super(nombre, 130);
    }

    @Override
    protected void atacar(String objetivo) {
        System.out.println("  Paladín golpea con mazo a " + objetivo + " — daño: 50");
    }

    @Override
    protected void aplicarEfectoEspecial() {
        System.out.println("  Paladín bendice al equipo: +20 HP para todos.");
    }
}
