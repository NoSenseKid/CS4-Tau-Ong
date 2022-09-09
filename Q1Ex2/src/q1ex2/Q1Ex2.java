/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;
    import java.util.Scanner;
/**
/**
 *
 * @author TAU
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Higher or Lower! Enter Start to play");
        String startInput = sc.nextLine();
        boolean gameStart = startInput.equals("Start");
        while(!gameStart){
            startInput = sc.nextLine();
            gameStart = startInput.equals("Start");
        }
        
        
        
    }
    
}
