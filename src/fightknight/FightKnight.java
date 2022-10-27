/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fightknight;
import java.util.*;
/**
 *
 * @author psantillan72
 */
public class FightKnight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player newPlayer = new Player();
        
        // true statement is placeholder. game will continue to loop until the player perishes or player decides to close out game.
        while (true){ 
            Func.menu();
            switch(sc.nextInt()){
                case 1 -> {
                    ;
                    // Battle next enemy
                }
                case 2 -> {
                    ;
                    // Sleep... risk of getting ambushed
                }
                case 3 -> {
                    ;
                    // Enter the Inn
                }
                case 4 -> newPlayer.showStats();
                // Show players stats
                default -> System.out.print("Invalid entry. Please try again.");
            }
            
        }
    }
    
}
