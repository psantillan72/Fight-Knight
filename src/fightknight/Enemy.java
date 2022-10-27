/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightknight;

/**
 *
 * @author psantillan72
 */
public class Enemy {
    String enemyName, enemyTypeName, enemyAbilityName;
    int hp, lvl, enemyDmg, enemyType, enemyAbility; 
    // Thinking about generating an array storing all of the different types of enemies. Some of those being goblins, trolls, orges, dragons... typical DnD BS.
    // Abilities may be able to negate/counter the player's wep ability depending on the enemy type (e.g. if an enemy spawns with a Holy ability, it will be able to counter the leech ability, ice enemy to counter )
    public void generateEnemy(){
        // Enemy Type
        switch (enemyType = Func.getRandomIntInRange(0,2)){
            case 0 -> enemyTypeName = "Goblin";
            case 1 -> enemyTypeName = "Knight";
            case 2 -> enemyTypeName = "Troll";
        }
        // Enemy Ability
        switch (enemyAbility = Func.getRandomIntInRange(0,5)){
            case 0 -> enemyAbilityName = "None";
            case 1 -> enemyAbilityName = "Occult";
            case 2 -> enemyAbilityName = "Arson";
            case 3 -> enemyAbilityName = "Holy";
            case 4 -> enemyAbilityName = "Aqua";
        }
        // Enemy LVL
        
        // Enemy DMG
    }
    //public void int getEnemyLvl(int playerLvl){
        
    //}
}
