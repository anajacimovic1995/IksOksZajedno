/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Ana
 */
public class Prize implements Serializable{
    private int prizeID;
    private String name;
    private String type;
    private String photo;

    public Prize() {
    }

    public Prize(int prizeID, String name, String type, String photo) {
        this.prizeID = prizeID;
        this.name = name;
        this.type = type;
        this.photo = photo;
    }

    public int getPrizeID() {
        return prizeID;
    }

    public void setPrizeID(int prizeID) {
        this.prizeID = prizeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Prize{" + "name=" + name + ", photo=" + photo + '}';
    }
    
    
    
}
