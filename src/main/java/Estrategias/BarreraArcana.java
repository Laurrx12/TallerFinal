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

public class BarreraArcana implements EstrategiaDefensa {
    @Override
    public String defender(String defensor) {
        return "🔮 " + defensor + " levanta barrera arcana — reduce 50 de daño";
    }
}
