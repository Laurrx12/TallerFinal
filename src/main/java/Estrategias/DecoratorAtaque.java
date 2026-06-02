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

public abstract class DecoratorAtaque implements Ataque {
    protected Ataque ataque;
    public DecoratorAtaque(Ataque a) { this.ataque = a; }

    @Override
    public String ejecutar() { return ataque.ejecutar(); }
    @Override
    public int    danio()    { return ataque.danio(); }
}

