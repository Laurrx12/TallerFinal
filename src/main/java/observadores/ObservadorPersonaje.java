/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observadores;

/**
 *
 * @author 2020g
 */

import com.mycompany.proyectfinal.Personaje;

public interface ObservadorPersonaje {
    void actualizar(Personaje personaje, String evento);
}
