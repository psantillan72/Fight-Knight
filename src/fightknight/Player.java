/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightknight;

/**
 *
 * @author psantillan72
 */
public class Player {
    int hp = 10, lvl = 1, newLvl = 0, weap = 0, gold = 0, exp = 0;
    boolean life = true;
    // Constructors
    public Player(){
        
    }
    
    // Methods
    // Display stats for player
    public void showStats(){
        System.out.print("""
                         Your stats: 
                         Health Points: """ + hp + "\n"
                        + "Level: " + lvl + "\n"
                        + "Weapon: " + weap +"\n" 
                        + "Gold: " + gold + "\n");
    }
    // Inventory system - store items in an array aka pouch
    // Player will start with 2 slots. A weapon will consume one slot. An item will consume one slot.
    // Items will be stored in a dynamic array. Array will expand depnding on what backpack they are carrying on them.
    
    // Player Level Methods - Usually these will be used whenever the player checks stats/gains EXP
    public void calcLevel(){
        // X: 0.07, Y: 2 -- (level/x)^y
        newLvl = exp / (int)Math.pow((lvl / 0.07 ), 2);
    }
    // Checks Level. If calculated level is greater thanaw
    public void checkLevel(){
        if (newLvl > 0){
            System.out.print("Level up! You've increased " + newLvl + "level(s)!!");
            lvl = lvl + newLvl;
            newLvl = 0;
     }
    }
    // Checks to see if player is still alive
    public boolean checkHP(){
        return (hp > 0);
    }
}
