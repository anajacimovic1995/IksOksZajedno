/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ana
 */
public class Game implements Serializable{
    private int gameID;
    private Date datum;

    public Game() {
    }

    public Game(int gameID, Date datum) {
        this.gameID = gameID;
        this.datum = datum;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Game{" + "datum=" + datum + '}';
    }
    
    
}
