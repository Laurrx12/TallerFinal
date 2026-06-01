/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public abstract class Personaje {

    protected String nombre;
    protected int hp;

    public Personaje(String nombre, int hp) {
        this.nombre = nombre;
        this.hp = hp;
    }

    public abstract String atacar();
}
