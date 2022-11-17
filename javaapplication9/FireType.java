/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author giano
 */
public class FireType extends Monster{
    
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special(){
        System.out.println(name + " did a pose.");
        atk += 2;
        hp -= maxHP*0.1;
        System.out.println(name + " increased its attack by 2 points for 10% of its HP");
    }
}
