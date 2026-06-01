/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class GestorMisiones {

    private static volatile GestorMisiones instancia;

    private ArrayList<String> misiones;

    private GestorMisiones() {
        misiones = new ArrayList<>();
    }

    public static GestorMisiones getInstance() {

        if(instancia == null) {

            synchronized(GestorMisiones.class) {

                if(instancia == null) {

                    instancia = new GestorMisiones();

                }
            }
        }

        return instancia;
    }

    public void agregarMision(String mision) {
        misiones.add(mision);
    }

    public void listar() {

        for(String m : misiones) {
            System.out.println(m);
        }
    }
}
