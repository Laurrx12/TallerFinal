/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class RegistroPartida {

    private static RegistroPartida instancia;

    private ArrayList<String> historial;

    private RegistroPartida() {
        historial = new ArrayList<>();
    }

    public static RegistroPartida getInstancia() {

        if(instancia == null) {
            instancia = new RegistroPartida();
        }

        return instancia;
    }

    public void registrar(String accion) {
        historial.add(accion);
    }

    public void mostrarHistorial() {

        for(String accion : historial) {
            System.out.println(accion);
        }
    }
}
