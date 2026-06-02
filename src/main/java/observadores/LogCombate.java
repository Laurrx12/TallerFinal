/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observadores;

import com.mycompany.proyectfinal.Personaje;

public class LogCombate implements ObservadorPersonaje {
    @Override
    public void actualizar(Personaje p, String e) {
        System.out.println("  [LOG] " + p.getNombre() + " → " + e);
    }
}

