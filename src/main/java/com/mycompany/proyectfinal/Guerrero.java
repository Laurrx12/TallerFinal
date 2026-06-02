/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectfinal;
/**
 *
 * @author Admin
 */
public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 150);
    }
    
    public Guerrero(String nombre, int hp) {
        super(nombre, hp); 
    }
    
    @Override
    protected void atacar(String objetivo) {
        System.out.println("  Guerrero golpea a " + objetivo + " — daño: 40");
    }
}
