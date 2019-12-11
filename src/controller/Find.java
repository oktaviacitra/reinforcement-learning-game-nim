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
public class Find {

    public Find() {
    }
    
    public Tree position(ArrayList<Tree> trees, State state) {
        Tree result = new Tree();
        for(Tree tree : trees) {
            if (tree.getPosition().getId() == state.getId()) {
                result = tree;
            }
        }
        return result;
    }
}
