/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Random;

/**
 *
 * @author oktaviacitra
 */
public class RandomType {
    Random random;

    public RandomType() {
        random= new Random();
    }
    
    public double getDecimal(double min, double max) {
        double result = min;
        do {
            result = random.doubles(min, (max + 1)).limit(1).findFirst().getAsDouble();
        } while(result > max || result < min);
        return result;
    }
    
    public int getNumber(int min, int max) {
        int result = min;
        do {
            result = random.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
        } while(result > max || result < min);
        return result;
    }
}
