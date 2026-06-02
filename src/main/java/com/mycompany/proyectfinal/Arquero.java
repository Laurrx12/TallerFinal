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
    public String atacar() {
        return nombre + " dispara flecha 🏹";
    }
}
