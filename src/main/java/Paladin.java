/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Paladin extends Personaje {

    public Paladin(String nombre) {
        super(nombre, 130);
    }

    @Override
    public String atacar() {
        return nombre + " bendice con escudo sagrado 🛡️";
    }
}
