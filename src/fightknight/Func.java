/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightknight;

/**
 *
 * @author psantillan72
 */
public class Func {
        public static void menu(){
            System.out.print("""
                             === === === === === ===
                             Here are your choices: 
                             1. Attack 
                             2. Roll
                             3. Shop
                             4. Show stats
                             What will you choose?
                             Enter your response here: """);
    }
    
    public static int getRandomIntInRange(int min, int max){
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        int result = (int)(Math.floor(Math.random()*(max-min+1)+min));
        return result;
    }
}
