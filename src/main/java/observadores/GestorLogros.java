/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observadores;

/**
 *
 * @author 2020g
 */
import com.mycompany.proyectfinal.Personaje;

public class GestorLogros implements ObservadorPersonaje {
    @Override
    public void actualizar(Personaje p, String e) {
        if (e.contains("nivel"))
            System.out.println("  [LOGRO] " + p.getNombre() + " sube de nivel!");
    }
}
