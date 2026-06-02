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
    public String atacar() {
        return nombre + " lanza bola de fuego 🔥";
    }
}
