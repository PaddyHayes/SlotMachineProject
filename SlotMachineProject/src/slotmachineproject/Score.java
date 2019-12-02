package slotmachineproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paddy
 */
//Got help with persistance from Ryan and Connor as I had missed the class due to illness
public class Score  {
    private int noOfWins;
    private int noOfKronks;
    private int noOfDonkeyKong;
    private int gamesPlayed;

    public Score()
    {
        noOfWins = 0;
        noOfKronks = 0;
        noOfDonkeyKong = 0;
        gamesPlayed = 0;

    }

    public Score(int noOfWins, int noOfKronks, int noOfDonkeyKong, int gamesPlayed)
    {
        this.noOfWins = noOfWins;
        this.noOfKronks = noOfKronks;
        this.noOfDonkeyKong = noOfDonkeyKong;
        this.gamesPlayed = gamesPlayed;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfKronks() {
        return noOfKronks;
    }

    public void setNoOfKronks(int noOfKronks) {
        this.noOfKronks = noOfKronks;
    }

    public int getNoOfDonkeyKong() {
        return noOfDonkeyKong;
    }

    public void setNoOfDonkeyKong(int noOfDonkeyKong) {
        this.noOfDonkeyKong = noOfDonkeyKong;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
    @Override
    public String toString()
    {
        return  "Games Played: " + getGamesPlayed() + 
                "\nWins: " + getNoOfWins() + 
                "\nKonks: " + getNoOfKronks() + 
                "\nKongs: " + getNoOfDonkeyKong();
    }
}
