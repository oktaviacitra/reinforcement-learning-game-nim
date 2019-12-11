/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.State;
import model.Tree;

/**
 *
 * @author oktaviacitra
 */
public class Compare {

    public Compare() {
    }
    
    public boolean isEnd(Tree tree) {
        ArrayList<State> states = new ArrayList<>();
        return tree.getChild().equals(states);
    }
    
    public boolean isStart(Tree tree) {
        State state = new State();
        return tree.getParent().equals(state);
    }
}
