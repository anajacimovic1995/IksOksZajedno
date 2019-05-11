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
public class Result implements Serializable{
    private String user;
    private Game game;
    private boolean haveWon;

    public Result() {
    }

    public Result(String user, Game game, boolean haveWon) {
        this.user = user;
        this.game = game;
        this.haveWon = haveWon;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isHaveWon() {
        return haveWon;
    }

    public void setHaveOne(boolean haveWon) {
        this.haveWon = haveWon;
    }

    @Override
    public String toString() {
        return "Result{" + "user=" + user + ", in the game number " + game + ", have won " + haveWon + '}';
    }
    
    
}
