/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author oktaviacitra
 */
public class Tree {
    private State parent;
    private State position;
    private ArrayList<State> child;

    public Tree() {
    }

    public Tree(State parent, State position, ArrayList<State> child) {
        this.parent = parent;
        this.position = position;
        this.child = child;
    }

    public State getParent() {
        return parent;
    }

    public void setParent(State parent) {
        this.parent = parent;
    }

    public State getPosition() {
        return position;
    }

    public void setPosition(State position) {
        this.position = position;
    }

    public ArrayList<State> getChild() {
        return child;
    }

    public void setChild(ArrayList<State> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return ("{" + parent.toString() + "} {" + position.toString() + "} {" + child + "}");
    }
}
