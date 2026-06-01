/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 150);
    }

    @Override
    public String atacar() {
        return nombre + " golpea con espada ⚔️";
    }
}
