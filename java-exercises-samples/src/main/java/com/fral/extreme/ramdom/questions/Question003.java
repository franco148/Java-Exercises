package com.fral.extreme.ramdom.questions;

/**
 * What is the output of the following code?
 * A. DeerReinder,false
 * B. DeerReinder,true      x
 * C. ReindeerDeer,false
 * D. ReindeerDeer,true
 */
class Deer {

    public Deer() {
        System.out.println("Deer");
    }
    public Deer(int age) {
        System.out.println("DeerAge");
    }
    public boolean hasHorns() {
        return false;
    }

}

class Reinder extends Deer {
    public Reinder(int age) {
        System.out.println("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

public class Question003 {

    public static void main(String[] args) {
        Deer deer = new Reinder(5);
        System.out.println("," + deer.hasHorns());
    }
}
