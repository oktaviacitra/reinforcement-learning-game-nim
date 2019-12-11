/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenim;

import java.util.ArrayList;
import model.Game;
import model.State;
import model.Tree;

/**
 *
 * @author oktaviacitra
 */
public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        ArrayList<Tree> trees = game.initialization();
        ArrayList<State> states = new ArrayList<>();
        System.out.println(states.equals(trees.get(23).getChild()));
    }
}
