/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrategias;

/**
 *
 * @author 2020g
 */
import interfaces.EstrategiaAtaque;

public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public String ejecutar(String a, String o) {
        return a + " golpea a " + o + " con espada ⚔️ — daño: 40";
    }
}



