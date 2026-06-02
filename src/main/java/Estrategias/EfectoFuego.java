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

public class EfectoFuego extends DecoratorAtaque {
    public EfectoFuego(Ataque a) { super(a); }

    @Override
    public String ejecutar() { return super.ejecutar() + " + Fuego"; }
    @Override
    public int    danio()    { return super.danio() + 20; }
}

