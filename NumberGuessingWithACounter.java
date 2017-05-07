/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessingwithacounter;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class NumberGuessingWithACounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int myNum, userInput, count;
        myNum = 1 + r.nextInt(10);
        count = 1;
        System.out.print("I'm thinking of a number between 1-10. can you guess? \n Your guess: ");
        userInput = keyboard.nextInt();
        
        while(userInput != myNum){
            
            System.out.print("Incorrect! guess again\n Your guess: ");
            userInput = keyboard.nextInt();
            myNum = 1 + r.nextInt(10);
            count++;
        }
        
        if(userInput == myNum){
            System.out.print("It only took you " + count + " tries!");
        }
    }
    
}
