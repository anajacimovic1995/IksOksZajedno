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
public class Level implements Serializable{
    private int levelID;
    private String name;
    private String condition;

    public Level() {
    }

    public Level(int levelID, String name, String condition) {
        this.levelID = levelID;
        this.name = name;
        this.condition = condition;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Level{" + "name=" + name + '}';
    }
    
    
    
}
