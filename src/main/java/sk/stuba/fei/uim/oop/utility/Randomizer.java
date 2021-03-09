package sk.stuba.fei.uim.oop.utility;

public class Randomizer {
    public static boolean getRandomBoolean(double probability) {
        double randomValue = Math.random()*100;  //0.0 to 99.9
        return randomValue <= probability;
    }
}
