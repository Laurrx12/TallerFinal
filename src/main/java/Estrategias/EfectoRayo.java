package Estrategias;

import interfaces.Ataque;

public class EfectoRayo extends DecoratorAtaque {
    public EfectoRayo(Ataque a) { super(a); }

    @Override
    public String ejecutar() { return super.ejecutar() + " + ⚡ Rayo"; }
    @Override
    public int    danio()    { return super.danio() + 25; }
}


