/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Racecrazy;

/**
 *
 * @author FAMILIA HEYR
 */
public class Veiculo {
    
    iMotor motor;
    
    Veiculo(iMotor m){
        //------
        this.motor = m;
    }
    
    public String acelerar(){
        return this.motor.acelerar();
    }
}
