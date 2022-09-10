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
        Scanner sc = new Scanner(System.in);
 
        boolean runApp = true;
        
        int lowLimit = 1;
        int highLimit = 10;
        int guesses = 3;
  
        while(runApp){
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start game");
            System.out.println("-Change settings");
            System.out.println("-End application");
            
            String choiceInput = sc.nextLine();
            
            System.out.println("");
            
            switch (choiceInput){
                case "Start game":
                {
                boolean playAgain = true;
                
                while(playAgain){
                    int random = (int) Math.floor(Math.random()*highLimit) + lowLimit;
                    for (int counter = guesses; counter >= 0 ; counter--) {
                        
                        if (counter == 0){
                            System.out.println("You lost...");
                            System.out.print("Play again (y/n)?");
                            sc = new Scanner(System.in);
                            String yOrN = sc.nextLine();
                            playAgain = yOrN.equals("y");
                            System.out.println("");
                            break;
                            }
                        else if(counter == 1){
                            System.out.printf("You have %d guess(es) left. What is your guess? ", counter);
                            int answer = sc.nextInt();
                            if (random == answer){
                                System.out.println("You got it!");
                                System.out.print("Play again (y/n)? ");
                                sc = new Scanner(System.in);
                                String yOrN = sc.nextLine();
                                playAgain = yOrN.equals("y");
                                System.out.println("");
                                break;
                            }
                        }
                        else
                        {
                            System.out.printf("You have %d guess(es) left. What is your guess? ", counter);
                            int answer = sc.nextInt();
                        
                            if (random == answer){
                                System.out.println("You got it!");
                                System.out.print("Play again (y/n)?");
                                sc = new Scanner(System.in);
                                String yOrN = sc.nextLine();
                                playAgain = yOrN.equals("y");
                                System.out.println("");
                                break;
                            }
                            else if (random > answer){
                                System.out.println("Guess higher!");
                            }
                            else{
                                System.out.println("Guess lower!");
                            }
                        }
                    }
                }
                break;
                }
                case "Change settings":
                {
                    System.out.println("What is the lower limit of the random number?");
                    lowLimit = sc.nextInt();
                    System.out.println("What is the upper limit of the random number?");
                    highLimit = sc.nextInt();
                    System.out.println("How many guesses are allowed?");
                    guesses = sc.nextInt();
                    System.out.println("");
     
                    break; 
                }
                case "End application":
                {     
                    System.out.println("Thank you for playing!");
                    runApp = false;
                    
                    break; 
                }
                default:
                {   
                    break;
                }
                
            }
        
        }
    }
    
}
