/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamenim;

import controller.Compare;
import controller.Find;
import controller.Print;
import java.util.ArrayList;
import java.util.Arrays;
import model.Game;
import model.State;
import model.Tree;
import java.util.Scanner;

/**
 *
 * @author oktaviacitra
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        ArrayList<Tree> trees = game.initialization();
        Print print = new Print();
        Find find = new Find();
        Compare compare = new Compare();
//        print.all(trees);
        System.out.print("Suruh berapa kali komputer belajar? ");
//        int n = 1000;
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            Tree current = trees.get(0);
            do {
                State selectedByComputer = game.eGreedy(current.getChild());
                double valueByComputer = game.valueFunction(current.getPosition(), selectedByComputer);
                current.getPosition().setValue(valueByComputer);
                current = find.position(trees, selectedByComputer);
                if(compare.isEnd(current) == true)
                    break;
                State selectedByAgent = game.eGreedy(current.getChild());
                double valueByAgent = game.valueFunction(current.getPosition(), selectedByAgent);
                current.getPosition().setValue(valueByAgent);
                current = find.position(trees, selectedByAgent);
            } while(compare.isEnd(current) == false);
        }
        System.out.print("Menampilkan hasil belajar komputer? (1 untuk Ya, 0 untuk Tidak) ");
        int answer = scanner.nextInt();
        if(answer == 1)
            print.value(trees);
        Tree current = trees.get(0);
        boolean computerWin = false;
        do {
            State selectedByComputer = game.eGreedy(current.getChild());
            System.out.println("\nKomputer pilih " + Arrays.toString(selectedByComputer.getNode()));
            double valueByComputer = game.valueFunction(current.getPosition(), selectedByComputer);
            current.getPosition().setValue(valueByComputer);
            current = find.position(trees, selectedByComputer);
            if(compare.isEnd(current) == true) {
                break;
            }
            ArrayList<State> states = current.getChild();
            int num = 1;
            System.out.println();
            for(State state : states) {
                System.out.println(num + ". " + Arrays.toString(state.getNode()));
                num++;
            }
            System.out.print("Masukkan pilihan : ");
            int index = scanner.nextInt();
            State selectedByAgent = states.get(index-1);
            System.out.println("\nManusia pilih " + Arrays.toString(selectedByAgent.getNode()));
            double valueByAgent = game.valueFunction(current.getPosition(), selectedByAgent);
            current.getPosition().setValue(valueByAgent);
            current = find.position(trees, selectedByAgent);
            if(compare.isEnd(current) == true) {
                computerWin = true;
                break;
            }
        } while(compare.isEnd(current) == false);
        if(computerWin == true) {
            System.out.println("\nKomputer Menang, Manusia Kalah!");
        } else {
            System.out.println("\nKomputer Kalah, Manusia Menang!");
        }
    }
}
