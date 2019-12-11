/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Tree;

/**
 *
 * @author oktaviacitra
 */
public class Print {

    public Print() {
    }
    
    public void all(ArrayList<Tree> trees) {
        System.out.println("===========================================================");
        trees.forEach((tree) -> { System.out.println(tree.toString()); });
        System.out.println("===========================================================");
    }
    
    public void value(ArrayList<Tree> trees) {
        System.out.println("-----------------------------------------");
        trees.forEach((tree) -> { System.out.println(tree.getPosition().getId() + "\t" + tree.getPosition().getValue()); });
        System.out.println("-----------------------------------------");
    }
}
