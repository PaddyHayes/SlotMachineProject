package slotmachineproject;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
public class SlotMachineMethods {
    int playerMoney = 0;

public void addMoney(int moneyAdd){
   playerMoney+=moneyAdd;
JOptionPane.showMessageDialog(null, playerMoney);
}

public int getMoney(){
    return playerMoney;
}
    
    
}
