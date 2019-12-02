package slotmachineproject;


import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
//Contructor
public class SlotMachineMethods {
    int playerMoney = 0;
    File f;
    ArrayList<Score> ScoreDetails;
    

    
//Method to add money to player balance
public void addMoney(int moneyAdd){
   playerMoney+=moneyAdd;
JOptionPane.showMessageDialog(null, playerMoney);
}//End of addMoney method

public int getMoney(){
    return playerMoney;
}
//Method to take player money
public void takeMoney(){
    if(getMoney()>=1)
        {
            //have money
            addMoney(-1);
            JOptionPane.showMessageDialog(null,"Current money: " + getMoney());
        }

        else
        {
            JOptionPane.showMessageDialog(null, "No money Fam");
            
            
        }
}//End of takeMoney method
//Method to write the stats file
public void writeStats(ArrayList<Score> scoreDetails)
    {

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(scoreDetails);
           // JOptionPane.showMessageDialog(null, "Score details saved successfully");
            oos.close();
        }

        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"File could not be found");

        }

        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Whoops IOException occurred");

        }

    }//end of saveStats file

    /*This opens the score that is currently saved in the file */
    public ArrayList<Score> readStats()
    {
        ArrayList<Score> scoreDetails = new ArrayList<Score>();

        try{

            File file = new File("score.dat");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            scoreDetails = (ArrayList<Score>) ois.readObject();
            ois.close();

        }

        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"Score file can't be found");
        }

        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"The file has drunk a potion of invisibility");

        }


        return scoreDetails;
    }//end of openStats
    

    
    
     
        

    

    

    
    
}//end of slotmachinesmethods constructor
