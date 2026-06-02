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

public class SistemaSonido implements ObservadorPersonaje {
    @Override
    public void actualizar(Personaje p, String evento) {
        if (evento.contains("daño")) {
            System.out.println("[SFX] 💥 sonido_golpe.mp3");
        } else if (evento.contains("nivel")) {
            System.out.println("[SFX] 🎵 level_up.mp3");
        } else {
            System.out.println("[SFX] 🔔 evento_desconocido.mp3");
        }
    }
}