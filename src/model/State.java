/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author oktaviacitra
 */
public class State {
    private int id;
    private int[] node;
    private double value;

    public State() {
    }

    public State(int id, int[] node, double value) {
        this.id = id;
        this.node = node;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getNode() {
        return node;
    }

    public void setNode(int[] node) {
        this.node = node;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return (id + " " + Arrays.toString(node) + " " + value);
    }
}
