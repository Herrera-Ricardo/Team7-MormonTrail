/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

/**
 *
 * @author dgedw
 */

import cit260.team7.mormontrail.model.Character;

public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Character characterOne = new Character();
        
         characterOne.setName("Savannah Fish");
         characterOne.setMoney(5.00);
         
         String characterOneName = characterOne.getName();
         double characterOneMoney = characterOne.getMoney();
         
         System.out.println(characterOne.toString());
    } 
    
}
