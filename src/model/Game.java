/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import service.RandomType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author oktaviacitra
 */
public class Game {

    public Game() {
    }
    
    public ArrayList<Tree> initialization() {
        ArrayList<Tree> trees = new ArrayList<>();
        State statenull = new State();
        ArrayList<State> childnull = new ArrayList<>();
        int[] node0 = {7};
        State state0 = new State(0, node0, 0.5);
        int[] node1 = {6, 1};
        State state1 = new State(1, node1, 0.5);
        int[] node2 = {5, 2};
        State state2 = new State(2, node2, 0.5);
        int[] node3 = {4, 3};
        State state3 = new State(3, node3, 0.5);
        int[] node4 = {5, 1, 1};
        State state4 = new State(4, node4, 0.5);
        int[] node5 = {4, 2, 1};
        State state5 = new State(5, node5, 0.5);
        int[] node6 = {4, 2, 1};
        State state6 = new State(6, node6, 0.5);
        int[] node7 = {3, 2, 2};
        State state7 = new State(7, node7, 0.5);
        int[] node8 = {4, 2, 1};
        State state8 = new State(8, node8, 0.5);
        int[] node9 = {3, 3, 1};
        State state9 = new State(9, node9, 0.5);
        int[] node10 = {4, 1, 1, 1};
        State state10 = new State(10, node10, 0.5);
        int[] node11 = {3, 2, 1, 1};
        State state11 = new State(11, node11, 0.5);
        int[] node12 = {3, 2, 1, 1};
        State state12 = new State(12, node12, 0.5);
        int[] node13 = {3, 2, 1, 1};
        State state13 = new State(13, node13, 0.5);
        int[] node14 = {2, 2, 2, 1};
        State state14 = new State(14, node14, 1);
        int[] node15 = {3, 2, 1, 1};
        State state15 = new State(15, node15, 0.5);
        int[] node16 = {3, 2, 1, 1};
        State state16 = new State(16, node16, 0.5);
        int[] node17 = {3, 1, 1, 1, 1};
        State state17 = new State(17, node17, 0.5);
        int[] node18 = {2, 2, 1, 1, 1};
        State state18 = new State(18, node18, 0);
        int[] node19 = {2, 2, 1, 1, 1};
        State state19 = new State(19, node19, 0);
        int[] node20 = {2, 2, 1, 1, 1};
        State state20 = new State(20, node20, 0);
        int[] node21 = {2, 2, 1, 1, 1};
        State state21 = new State(21, node21, 0);
        int[] node22 = {2, 2, 1, 1, 1};
        State state22 = new State(22, node22, 0);
        int[] node23 = {2, 2, 1, 1, 1};
        State state23 = new State(23, node23, 1);
        ArrayList<State> child0 = new ArrayList<>();
        child0.add(state1);
        child0.add(state2);
        child0.add(state3);
        trees.add(new Tree(statenull, state0, child0));
        ArrayList<State> child1 = new ArrayList<>();
        child1.add(state4);
        child1.add(state5);
        trees.add(new Tree(state0, state1, child1));
        ArrayList<State> child2 = new ArrayList<>();
        child2.add(state6);
        child2.add(state7);
        trees.add(new Tree(state0, state2, child2));
        ArrayList<State> child3 = new ArrayList<>();
        child3.add(state8);
        child3.add(state9);
        trees.add(new Tree(state0, state3, child3));
        ArrayList<State> child4 = new ArrayList<>();
        child4.add(state10);
        child4.add(state11);
        trees.add(new Tree(state1, state4, child4));
        ArrayList<State> child5 = new ArrayList<>();
        child5.add(state12);
        trees.add(new Tree(state1, state5, child5));
        ArrayList<State> child6 = new ArrayList<>();
        child6.add(state13);
        trees.add(new Tree(state2, state6, child6));
        ArrayList<State> child7 = new ArrayList<>();
        child7.add(state14);
        trees.add(new Tree(state2, state7, child7));
        ArrayList<State> child8 = new ArrayList<>();
        child8.add(state15);
        trees.add(new Tree(state3, state8, child8));
        ArrayList<State> child9 = new ArrayList<>();
        child9.add(state16);
        trees.add(new Tree(state3, state9, child9));
        ArrayList<State> child10 = new ArrayList<>();
        child10.add(state17);
        trees.add(new Tree(state4, state10, child10));
        ArrayList<State> child11 = new ArrayList<>();
        child11.add(state18);
        trees.add(new Tree(state4, state11, child11));
        ArrayList<State> child12 = new ArrayList<>();
        child12.add(state19);
        trees.add(new Tree(state5, state12, child12));
        ArrayList<State> child13 = new ArrayList<>();
        child13.add(state20);
        trees.add(new Tree(state6, state13, child13));
        trees.add(new Tree(state7, state14, childnull));
        ArrayList<State> child15 = new ArrayList<>();
        child15.add(state21);
        trees.add(new Tree(state8, state15, child15));
        ArrayList<State> child16 = new ArrayList<>();
        child16.add(state22);
        trees.add(new Tree(state9, state16, child16));
        ArrayList<State> child17 = new ArrayList<>();
        child17.add(state23);
        trees.add(new Tree(state10, state17, child17));
        trees.add(new Tree(state11, state18, childnull));
        trees.add(new Tree(state12, state19, childnull));
        trees.add(new Tree(state13, state20, childnull));
        trees.add(new Tree(state15, state21, childnull));
        trees.add(new Tree(state16, state22, childnull));
        trees.add(new Tree(state17, state23, childnull));
        return trees;
    }
    
    public State eGreedy(ArrayList<State> children) {
        State result = null;
        RandomType random = new RandomType();
        double probability = random.getDecimal(0.0, 1.0);
//        System.out.println(probability);
        if (probability < 0.50) {
            int index = 0;
//            System.out.println("---" + children.size());
            if(children.size() > 1) {
                index = random.getNumber(0, (children.size() - 1));
            }
//            System.out.println(index);
            result = children.get(index);
        } else {
            result = Collections.max(children, Comparator.comparing(child -> child.getValue()));
        }
        return result;
    }
    
    public State greedy(ArrayList<State> children) {
        return Collections.max(children, Comparator.comparing(child -> child.getValue()));
    }
    
    public double valueFunction(State current, State next) {
        return (current.getValue() + (0.1 * (next.getValue() - current.getValue())));
    }
}
