/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
import java.util.ArrayList;
/**
 *
 * @author giano
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer Ash = new Trainer("Ash Ketchum");
        Monster Decidueye = new GrassType("Rillaboom", 100, 50);
        NPC Camper = new NPC("Greg");
        Location PalletTown = new Location("Pallet Town");
        
        Ash.inspect(Decidueye);
        Ash.inspect(Camper);
        Ash.inspect(PalletTown);
        
    }
    
}
