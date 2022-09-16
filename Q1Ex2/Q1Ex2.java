/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.pkg2.pkg0;
    import java.util.Scanner;
/**
 *
 * @author giano
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ci = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        String choiceInput;
        
        int range = 10;
        int min = 1;
        int guesses = 3;
        
        do{
            System.out.println("Welcome to Higher or Lower! What will you do?");
            
            System.out.println("-Start game");
            System.out.println("-Change settings");
            System.out.println("-End application");  
            
            choiceInput = ci.nextLine();

            switch (choiceInput){
                case "Start game":
                {
                    String playAgain;
                    do {
                        System.out.println("");
                        
                        int random = (int) Math.floor(Math.random()*range) + min;

                        for (int remaining = guesses; remaining >= 0 ; remaining--) {  
                            
                            //zero guess condition
                            if (remaining == 0){
                                System.out.println("You lost...");
                                break;
                            }
                            
                            System.out.printf("You have %d guess(es) left. What is your guess? ", remaining);
                            int answer = guess.nextInt();

                            if (random == answer){
                                System.out.println("You got it!");
                                break;
                            }
                            else {
                                if (remaining > 1){
                                    if (random > answer){
                                        System.out.println("Guess higher!");
                                    }
                                    else{
                                        System.out.println("Guess lower!");
                                    }
                                }
                            }   
                        }  
                        System.out.print("Play again (y/n)? ");
                        playAgain = yn.nextLine();
                    }
                    while(playAgain.equals("y"));
                    
                }
                break;
            
                case "Change settings":
                { 
                System.out.println("");   
                    
                System.out.println("What is the lower limit of the random number?");
                min = num.nextInt();
                
                System.out.println("What is the upper limit of the random number?");
                range = num.nextInt();
                
                System.out.println("How many guesses are allowed?");
                guesses = num.nextInt();
                
                break;
                }  
            }
            
            System.out.println("");
        } 
        while(!choiceInput.equals("End application"));
        
        System.out.println("Thank you for playing!");
    }
    
}
