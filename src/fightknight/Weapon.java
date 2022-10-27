/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightknight;

/**
 *
 * @author psantillan72
 */
public class Weapon {
        String  wepName = "", wepAbilityName = "None", wepNameType = "Fists";
    int  wepDmg = 1, wepModDmg = 0, wepType = 0, wepAbility = 0;
    boolean hasMod = false, hasAbility = false;
    // Weapon Constructors
    public Weapon(){
        generateWepAtt();
    }
    public Weapon(int wep){
        wepType = wep;
    }
    
    // Display Stats
    public void showStats() {
      System.out.print("""
                       Weapon Stats: 
                       Weapon Name: """ + wepName + "\n" +
                      "Weapon Type: " + wepNameType + "\n" +
                      "DMG: " + wepDmg + "\n"); 
    }
    // Sets values to a weapon 
    public void generateWepAtt(){
        // Generate Weapon Modifier
        if (Math.random() > .6){
        wepModDmg = Func.getRandomIntInRange(-10,10);
        hasMod = true;
        }
        // Generate Weapon Type
        switch (wepType = Func.getRandomIntInRange(0,4)){
            case 0 -> wepNameType = "Caestus";
            case 1 -> wepNameType = "Club";
            case 2 -> wepNameType = "Blade";
            case 3 -> wepNameType = "Bow";
            case 4 -> wepNameType = "Staff";
        }
        // Generate Weapon Ability
        wepAbility = Func.getRandomIntInRange(0, 3);
        hasAbility = wepAbility > 0;
        switch(wepAbility) {
            case 0 -> wepAbilityName = "None";
            case 1 -> wepAbilityName = "Occult";
            case 2 -> wepAbilityName = "Arson";
            case 3 -> wepAbilityName = "Holy";
            case 4 -> wepAbilityName = "Aqua";
        }
        // Generate Weapon Damage
        double dmgRoll = Math.random();
        if (dmgRoll <= .5)
            wepDmg = Func.getRandomIntInRange(1,10);
        if (dmgRoll > .5 & dmgRoll <= .75)
            wepDmg = Func.getRandomIntInRange(11, 30);
        if (dmgRoll >.75 & dmgRoll <= .9)
            wepDmg = Func.getRandomIntInRange(15,50);
        if (dmgRoll >.9)
            wepDmg = Func.getRandomIntInRange(30,100);
        wepDmg = wepDmg + wepModDmg;
        // Generate Weapon Name
        if (hasMod){
            if (wepModDmg > 0)
                wepName = "Honed ";
            if (wepModDmg < 0)
                wepName = "Broken ";
            else 
                wepName = "";
        }
        wepName = wepName + wepNameType; 
        if (hasAbility)
            wepName = wepName + " of " + wepAbilityName;
    }
}
