package model;

import model.gameSystem.*;

import java.util.ArrayList;
import java.util.List;

public class DispatchAdapter {
    private Game game;
    public DispatchAdapter(){
        this.game = new Game(1,6);
    }

    public ArrayList<String> getSetUpInfo(){
        return game.setUpGame();
    }
}
