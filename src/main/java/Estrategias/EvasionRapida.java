/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrategias;

/**
 *
 * @author 2020g
 */
import interfaces.EstrategiaDefensa;

public class EvasionRapida implements EstrategiaDefensa {
    @Override
    public String defender(String defensor) {
        return "🏃 " + defensor + " esquiva — evita todo el daño";
    }
}
