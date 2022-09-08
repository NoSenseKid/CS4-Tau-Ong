/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;
    import java.util.Scanner;
/**
 *
 * @author TAU
 */
public class JavaProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pokemon1 = "Charmander";
        String pokemon2 = "Squirtle";
        String pokemon3 = "Bulbasaur";
        
        String type1 = "Fire";
        String type2 = "Water";
        String type3 = "Grass";      
     
        int pokedexNo1 = 4;
        int pokedexNo2 = 7;
        int pokedexNo3 = 1;
        
        String move1 = "Flamethrower";
        String move2 = "Water Pulse";
        String move3 = "Seed Bomb";
        
        boolean pokeNumber;
        if (pokedexNo3 == pokedexNo2){
            pokeNumber = true;      
        }
        else{
            pokeNumber = false; 
        }
        
        boolean pokeChecker;
        if (pokedexNo2 > pokedexNo1){
            pokeChecker = true;      
        }
        else{
            pokeChecker = false; 
        }
        
        boolean typeCheck = type1.equals(type3);
 
        System.out.printf("Pokemon 1: %s\n", pokemon1);
        System.out.printf("Type: %s\n", type1);
        System.out.printf("Pokedex Number: %d\n", pokedexNo1);
        System.out.printf("Base Move: %s\n", move1);
        
        System.out.println("");
        
        System.out.printf("Pokemon 2: %s\n", pokemon2);
        System.out.printf("Type: %s\n", type2);
        System.out.printf("Pokedex Number: %d\n", pokedexNo2);
        System.out.printf("Base Move: %s\n", move2);
        
        System.out.println("");
        
        System.out.printf("Pokemon 3: %s\n", pokemon3);
        System.out.printf("Type: %s\n", type3);
        System.out.printf("Pokedex Number: %d\n", pokedexNo3);
        System.out.printf("Base Move: %s\n", move3);
        
        System.out.println("");
   
        System.out.printf("Do Bulbasaur and Squirtle have the same pokedex number: %s \n", pokeNumber);
        System.out.printf("Did Charmander go first than Squirtle in the pokedex: %s \n", pokeChecker);
        System.out.printf("Do Charmander and Bulbasaur have the same type: %s \n", typeCheck);
        
    }
    
}
