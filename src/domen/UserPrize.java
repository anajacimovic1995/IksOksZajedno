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
public class UserPrize implements Serializable{
    private String username;
    private int prizeID;
    private Date datum;

    public UserPrize() {
    }

    public UserPrize(String username, int prizeID, Date datum) {
        this.username = username;
        this.prizeID = prizeID;
        this.datum = datum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPrizeID() {
        return prizeID;
    }

    public void setPrizeID(int prizeID) {
        this.prizeID = prizeID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
    
            
}
