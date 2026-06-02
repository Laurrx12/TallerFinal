/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrategias;

/**
 *
 * @author 2020g
 */
import interfaces.Ataque;

public class AtaqueBasico implements Ataque {
    @Override
    public String ejecutar() { return "Ataque básico con espada"; }
    @Override
    public int    danio()    { return 30; }
}

