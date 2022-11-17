/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author giano
 */
public class WaterType extends Monster{
    
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base);
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special(){
        System.out.println(name + " did a pose.");
        def += 2;
        hp -= maxHP*0.1; 
        System.out.println(name + " increased its defense by 2 points for 10% of its HP");
    }
}
